package com.mshimawanadityasbetest.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResponseDTO {

    private String statusCode;
    private String message;
    private UserDTO data;

}
