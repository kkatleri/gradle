package com.learn.gradle.repository;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.learn.gradle.model.User;

@Component
public class UserRepositoryIT implements UserRepositoryInterface{

	
	private static final Logger logger = Logger.getLogger("UserRepositoryIT");
	
	@Override
	public User read(User domain) {
		logger.info("Entered UserRepositoryIT->read with:" + domain);
		
		final User newUser = new User();
		newUser.setId(domain.getId());
		newUser.setName("Jim Beam");
		newUser.setAge(46);
		
		logger.info("Exiting UserRepositoryIT->read with:" + newUser);
		return newUser;
	}

	@Override
	public User update(User domain) {		
		return null;
	}

	

}
