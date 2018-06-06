package com.abhi.atm.repository.user;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.abhi.atm.dao.entity.User;

public interface UserRepository extends MongoRepository<User, Integer>{

	Optional<User> findByUserName(String userName);
}
