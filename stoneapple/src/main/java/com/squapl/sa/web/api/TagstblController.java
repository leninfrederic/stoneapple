package com.squapl.sa.web.api;

import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.squapl.sa.domain.Article;
import com.squapl.sa.domain.Category;
import com.squapl.sa.domain.Tagstbl;
import com.squapl.sa.service.TagstblService;

@RestController
public class TagstblController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private TagstblService tagstblservice;
	
	@RequestMapping(
			value="api/tagstbls",
			method=RequestMethod.GET,
			   produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Tagstbl>> getTagstbls() {
    	
        Collection<Tagstbl> tagstables = tagstblservice.findall();
       	
       	
        return new ResponseEntity<Collection<Tagstbl>>(tagstables,
                HttpStatus.OK);
}
	
	 @RequestMapping(
	            value = "/api/tagstbls/{id}",
	            method = RequestMethod.GET,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Tagstbl> getTagstbl(@PathVariable("id") Long idtags) {
	    	logger.info("> getTagstbl id:{}", idtags);        

	    	Tagstbl tagstbl = tagstblservice.findonebyid(idtags);
	        
	        
	    	logger.info("< getTagstbl id:{}", idtags);
	        
	        return new ResponseEntity<Tagstbl>(tagstbl, HttpStatus.OK);
	    }
	 
	 @RequestMapping(
				value="api/tagstbls",
				 method = RequestMethod.POST,
		            consumes = MediaType.APPLICATION_JSON_VALUE,
		            produces = MediaType.APPLICATION_JSON_VALUE)
		    public ResponseEntity<Tagstbl> createTagstbl(
		            @RequestBody Tagstbl tagstbl) {
		    	logger.info("> createTagstbl");

		    	Tagstbl savedTagstbl = tagstblservice.adding(tagstbl);
		        
		        logger.info("< createTagstbl");
		        
		        return new ResponseEntity<Tagstbl>(savedTagstbl, HttpStatus.CREATED);
		    }
	 
	 @RequestMapping(
				value = "api/tagstbls/{id}",
				method = RequestMethod.DELETE)
				
			public ResponseEntity<Tagstbl> deletingTagstbl(
					@PathVariable("id") Long idtags){
		
			tagstblservice.deleting(idtags);
			
			return new ResponseEntity<Tagstbl>(HttpStatus.NO_CONTENT);
		}
	 
	 @RequestMapping(
			 value = "api/tagstbls/{id}",
			 method = RequestMethod.PUT,
			 consumes = MediaType.APPLICATION_JSON_VALUE,
			 produces = MediaType.APPLICATION_JSON_VALUE)
	 
		 public ResponseEntity<Tagstbl> updateTagstbl(
		            @RequestBody Tagstbl tagstbl) {
		 
	    	logger.info("> updateTagstbl id:{}", tagstbl.getIdtags());

			 
		 Tagstbl savedtagstbl = tagstblservice.update(tagstbl);
		 
	    	logger.info("> updateTagstbl id:{}", tagstbl.getIdtags());

		 return new ResponseEntity<Tagstbl>(savedtagstbl,HttpStatus.OK);
	 }
}
