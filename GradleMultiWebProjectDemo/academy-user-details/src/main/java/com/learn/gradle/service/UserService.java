package com.learn.gradle.service;

import java.util.logging.Logger;

import javax.inject.Inject;

import com.learn.gradle.model.User;
import com.learn.gradle.repository.UserRepositoryInterface;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {

	@Inject
	private UserRepositoryInterface userRepository;
	
	
	private static final Logger logger = Logger.getLogger("UserService");
	
	@Override
	public User read(User domain) {
		logger.info("Entered UserService->read with:" + domain);
		return userRepository.read(domain);
	}

	@Override
	public User update(User domain) {	
		return null;
	}

	
}
