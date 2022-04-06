package com.security.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.security.model.Userinfo;

@Repository
public interface UserInfoRepo extends MongoRepository<Userinfo, String>{
	Userinfo findByUserName(String userName);

}
