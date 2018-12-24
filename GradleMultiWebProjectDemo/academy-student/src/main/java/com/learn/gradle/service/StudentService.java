package com.learn.gradle.service;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.learn.gradle.model.Student;
import com.learn.gradle.model.User;

@Service
public class StudentService implements StudentServiceInterface {

	private static final Logger logger = Logger.getLogger("StudentService");

	@Inject
	private UserServiceInterface userService;

	@Override
	public Student read(final Student domain) {		
		logger.info("Entered StudentService->read with:" + domain);
		final User user = userService.read(domain);
		final Student student = Student.valueOf(user);
		logger.info("Exiting StudentService->read with:" + student);
		return student;
	}

	@Override
	public Student update(Student domain) {
		return null;
	}

}
