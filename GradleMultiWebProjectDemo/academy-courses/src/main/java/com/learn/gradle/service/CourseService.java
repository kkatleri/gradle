package com.learn.gradle.service;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.learn.gradle.model.Course;
import com.learn.gradle.repository.CourseRepositoryInterface;

@Service
public class CourseService implements CourseServiceInterface {

	
	private static final Logger logger = Logger.getLogger("CourseService");
	
	@Inject
	private CourseRepositoryInterface courseRepository;
	
	@Override
	public Course read(final Course domain) {		
		logger.info("Entered method " + this.getClass().getSimpleName() + " read() with " + domain);
		
		final Course course = courseRepository.read(domain);
		
		logger.info("Exiting method " + this.getClass().getSimpleName() + " read() with " + course);		
		return course;
	}

	@Override
	public Course update(final Course domain) {	
		return null;
	}

	
}
