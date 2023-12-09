package com.mshimawanadityasbetest.repository;

import com.mongodb.internal.operation.ListCollectionsOperation;
import com.mshimawanadityasbetest.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

    User findByAccountNumber(String accountNumber);

    User findByIdentityNumber(String identityNumber);

}
