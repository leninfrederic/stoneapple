package com.squapl.sa.service;

import java.util.Collection;

import com.squapl.sa.domain.Property;

public interface PropertyService {

	Collection<Property> findall();
	
	Property findonebyid(Long idproperty);
	
	Property adding(Property property);
	
	void deleting(Long idproperty);
}
