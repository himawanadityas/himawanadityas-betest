package com.mshimawanadityasbetest;

import com.mshimawanadityasbetest.entity.User;
import com.mshimawanadityasbetest.repository.UserRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
public class MongoRepositoryTest {

    @Autowired
    UserRepository userRepository;
    User user;

    @BeforeEach
    void assignUserValue(){
        user = User.builder()
                .id(12)
                .userName("HIMAWAN")
                .accountNumber("ACC123")
                .identityNumber("ID01234")
                .emailAddress("himawan.adityas00@gmail.com")
                .build();

        System.out.println(user);
    }

    @Test
    @Order(1)
    @DisplayName("Test insert data to MongoDB")
    void saveToMongoDB_and_ReturnItAsUserObject(){

        User userTemp = userRepository.save(user);
        Assertions.assertEquals(user, userTemp);

    }

    @Test
    @DisplayName("Test fetching by account number the data from mongoDB")
    void getDataFromMongoDB(){
        User userFetch = userRepository.findByAccountNumber(user.getAccountNumber());
        System.out.println(userFetch);
        Assertions.assertEquals(user, userFetch);
    }

    @Test
    @DisplayName("Test fetching by identity number the data from mongoDB")
    void getDataByIdentityNumberFromMongoDB(){
        User userFetch = userRepository.findByIdentityNumber(user.getIdentityNumber());
        System.out.println(userFetch);
        Assertions.assertEquals(user, userFetch);
    }



}
