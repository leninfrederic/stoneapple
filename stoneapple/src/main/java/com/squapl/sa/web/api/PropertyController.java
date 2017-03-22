package com.squapl.sa.web.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.squapl.sa.domain.Property;
import com.squapl.sa.service.PropertyService;

@RestController
public class PropertyController {
	
	@Autowired
	private PropertyService propertyservice;

	@RequestMapping(
			value="api/property",
			method=RequestMethod.GET,
			   produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Property>> getProperties() {
    	
        Collection<Property> allproperties = propertyservice.findall();
       	
       	
        return new ResponseEntity<Collection<Property>>(allproperties,
                HttpStatus.OK);
}

	@RequestMapping(
            value = "/api/property/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Property> getProperty(@PathVariable("id") Long idproperty) {

		Property property = propertyservice.findonebyid(idproperty);
        
        
        return new ResponseEntity<Property>(property, HttpStatus.OK);
    }
	
	 @RequestMapping(
				value="api/property",
				 method = RequestMethod.POST,
		            consumes = MediaType.APPLICATION_JSON_VALUE,
		            produces = MediaType.APPLICATION_JSON_VALUE)
		    public ResponseEntity<Property> createProperty(
		            @RequestBody Property property) {

		    	Property savedProperty = propertyservice.adding(property);
		        
		        
		        return new ResponseEntity<Property>(savedProperty, HttpStatus.CREATED);
		    }
	 
	 @RequestMapping(
				value = "api/property/{id}",
				method = RequestMethod.DELETE)
				
			public ResponseEntity<Property> deletingTagstbl(
					@PathVariable("id") Long idproperty){
		
		 propertyservice.deleting(idproperty);
			
			return new ResponseEntity<Property>(HttpStatus.NO_CONTENT);
		}
	 
	
}
