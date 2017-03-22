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

import com.squapl.sa.domain.Pictures;
import com.squapl.sa.domain.Property;
import com.squapl.sa.domain.Tagstbl;
import com.squapl.sa.service.PicturesService;


@RestController
public class PicturesController {
	
	@Autowired
	private PicturesService picturesservice;
	
	@RequestMapping(
			value="api/pictures",
			method=RequestMethod.GET,
			   produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Pictures>> getPictures() {
    	
        Collection<Pictures> pictures = picturesservice.findall();
       	       	
        return new ResponseEntity<Collection<Pictures>>(pictures,
                HttpStatus.OK);
}

	@RequestMapping(
            value = "/api/pictures/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Pictures> getPictures(@PathVariable("id") Long picid) {

		Pictures pictures = picturesservice.findonebyid(picid);
        
        
        return new ResponseEntity<Pictures>(pictures, HttpStatus.OK);
    }
	
	 @RequestMapping(
				value="api/pictures",
				 method = RequestMethod.POST,
		            consumes = MediaType.APPLICATION_JSON_VALUE,
		            produces = MediaType.APPLICATION_JSON_VALUE)
		    public ResponseEntity<Pictures> createPictures(
		            @RequestBody Pictures pictures) {

		 Pictures savedpictures = picturesservice.adding(pictures);
		      
		 return new ResponseEntity<Pictures>(savedpictures, HttpStatus.CREATED);
		    }
	 
	 @RequestMapping(
				value = "api/pictures/{id}",
				method = RequestMethod.DELETE)
				
			public ResponseEntity<Pictures> deletingPictures(
					@PathVariable("id") Long Picid){
		
		 picturesservice.deleting(Picid);
			
			return new ResponseEntity<Pictures>(HttpStatus.NO_CONTENT);
		}
	 @RequestMapping(
			 value = "api/pictures/{id}",
			 method = RequestMethod.PUT,
			 consumes = MediaType.APPLICATION_JSON_VALUE,	
			 produces = MediaType.APPLICATION_JSON_VALUE)
	 		
		 public ResponseEntity<Pictures> updatePictures(
		            @RequestBody Pictures pictures) {
			 
		 Pictures savedpictures = picturesservice.update(pictures);
		 
		 return new ResponseEntity<Pictures>(savedpictures,HttpStatus.CREATED);
	 }
	
}
