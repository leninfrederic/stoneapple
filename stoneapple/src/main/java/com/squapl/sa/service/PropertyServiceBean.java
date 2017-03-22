package com.squapl.sa.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squapl.sa.domain.Property;
import com.squapl.sa.domain.PropertyRepository;

@Service
public class PropertyServiceBean implements PropertyService {
	
	@Autowired
	private PropertyRepository propertyrepository;

	@Override
	public Collection<Property> findall() {
    Collection<Property> allproperty = propertyrepository.findAll();		// TODO Auto-generated method stub
		return allproperty;
	}

	@Override
	public Property findonebyid(Long idproperty) {
		Property property = propertyrepository.findOne(idproperty);
		// TODO Auto-generated method stub
		return property;
	}

	@Override
	public Property adding(Property property) {
		Property savedProperty = propertyrepository.save(property);
		// TODO Auto-generated method stub
		return savedProperty;
	}

	@Override
	public void deleting(Long idproperty) {
		propertyrepository.delete(idproperty);
		// TODO Auto-generated method stub
		
	}

}
