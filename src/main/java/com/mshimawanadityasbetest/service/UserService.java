package com.mshimawanadityasbetest.service;

import com.mshimawanadityasbetest.dto.UserDTO;
import com.mshimawanadityasbetest.entity.User;

import java.util.List;

public interface UserService {
    User getUserByAccountNumber(String accNumber) throws Exception;
    User getUserByIdentityNumber(String idNumber) throws Exception;

    User save(User user);

    User update(User user);

    void delete(Integer id);
}
