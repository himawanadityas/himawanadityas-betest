package com.mshimawanadityasbetest;

import com.mshimawanadityasbetest.entity.User;
import com.mshimawanadityasbetest.service.UserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    User user;

    @BeforeEach
    void setUser(){
        user = User.builder()
                .id(1)
                .userName("HIMAWAN")
                .accountNumber("ACC012")
                .identityNumber("ID-123")
                .emailAddress("himawan.adityas00@gmail.com")
                .build();
    }

    @Test
    @Order(1)
    void saveUser() {
    }



}
