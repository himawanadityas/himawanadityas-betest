package com.mshimawanadityasbetest.entity;


import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "user")
public class User {

    @Id
    private Integer id;

    @Indexed(unique = true)
    private String userName;

    @NonNull
    @Indexed(unique = true)
    private String accountNumber;

    @Indexed(unique = true)
    private String emailAddress;

    @NonNull
    @Indexed(unique = true)
    private String identityNumber;

}
