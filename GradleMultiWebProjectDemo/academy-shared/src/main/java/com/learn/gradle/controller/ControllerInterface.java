package com.learn.gradle.controller;

import com.learn.gradle.model.DomainObject;

public interface ControllerInterface<T extends DomainObject> {
	
	T read(final T DomainObject);
	
	T update(final T DomainObject);
	
}
