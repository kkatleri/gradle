package com.learn.gradle.controller;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import com.learn.gradle.model.Course;
import com.learn.gradle.model.Registration;
import com.learn.gradle.model.Student;
import com.learn.gradle.service.RegistrationServiceInterface;

@Controller
public class RegistrationController implements RegistrationControllerInterface{

	@Inject
	private StudentControllerInterface studentController;

	@Inject
	private CourseControllerInterface courseController;
	
	@Inject
	private RegistrationServiceInterface registrationService;
	
	private static final Logger logger = Logger.getLogger("RegistrationController");
	
	@Override
	public Registration read(Registration domain) {
		
		logger.info("Entered method " + this.getClass().getSimpleName() + " read() with " + domain);
		final Course course = courseController.read(domain.getCourse());
		final Student student = studentController.read(domain.getStudent());
		
		final Registration registration = registrationService.read(domain);
		registration.setCourse(course);
		registration.setStudent(student);
		
		logger.info("Exiting method " + this.getClass().getSimpleName() + " read() with " + registration);
		return registration;
	}

	@Override
	public Registration update(Registration DomainObject) {
		return null;
	}



}
