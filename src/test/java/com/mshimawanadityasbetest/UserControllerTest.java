package com.mshimawanadityasbetest;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@WebMvcTest
public class UserControllerTest {

    MockMvc mockMvc;

//    void getUserByAccNumber() throws Exception {
//        mockMvc.perform(
//                MockMvcRequestBuilders
//                        .get("/user")
//                        .accept(MediaType.APPLICATION_JSON))
//                .andDo(System.out::println)
//                .andExpect(MockMvcResultMatchers.)
//        );
//    }


}
