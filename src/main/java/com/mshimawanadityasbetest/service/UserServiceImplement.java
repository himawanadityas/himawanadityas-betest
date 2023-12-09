package com.mshimawanadityasbetest.service;

import com.mshimawanadityasbetest.dto.UserDTO;
import com.mshimawanadityasbetest.entity.User;
import com.mshimawanadityasbetest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableCaching
public class UserServiceImplement implements UserService {


    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserByAccountNumber(String accNumber) {
        return userRepository.findByAccountNumber(accNumber);
    }

    @Override
    public User getUserByIdentityNumber(String idNumber) {
        return userRepository.findByIdentityNumber(idNumber);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.findById(user.getId())
                .map(userMap ->
                        {
                            userMap.setUserName(user.getUserName());
                            return userRepository.save(userMap);
                        }
                ).orElseGet(
                        () -> userRepository.save(user)
                );
    }

    @Override
    public void delete(Integer id) {
        userRepository.findById(id)
                .ifPresent(
                        userVal -> userRepository.delete(userVal)
                );
    }

}
