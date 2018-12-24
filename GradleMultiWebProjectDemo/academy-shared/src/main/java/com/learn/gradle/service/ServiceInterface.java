package com.learn.gradle.service;

import com.learn.gradle.model.DomainObject;

public interface ServiceInterface<T extends DomainObject> {

	
	T read(final T domainObject);
	
	T update(final T domainObject);
	
	
}
