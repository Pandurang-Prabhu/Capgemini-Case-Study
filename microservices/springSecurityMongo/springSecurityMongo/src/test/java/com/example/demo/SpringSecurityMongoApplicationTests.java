package com.example.demo;

import com.example.demo.model.UserModel;
import com.example.demo.model.UserRepository;
import com.example.demo.service.UserService;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.net.UnknownServiceException;

@SpringBootTest
class SpringSecurityMongoApplicationTests {

	@Autowired
	private UserService userService;
	@MockBean
	private UserRepository userRepository;

	@Test
	void registerUSer() {
	}

}
