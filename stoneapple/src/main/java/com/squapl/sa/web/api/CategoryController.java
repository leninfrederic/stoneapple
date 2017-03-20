package com.squapl.sa.web.api;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.squapl.sa.domain.Article;
import com.squapl.sa.domain.Category;
import com.squapl.sa.service.CategoryService;

@RestController
public class CategoryController {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CategoryService categoryservice;
	
	@RequestMapping(
			value="api/allcategory",
			method=RequestMethod.GET,
			   produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Category>> getCategories() {
    	logger.info("> getCategories");
    	
        Collection<Category> categories = categoryservice.findAll();
       	
        logger.info("< getCategories");
       	
        return new ResponseEntity<Collection<Category>>(categories,
                HttpStatus.OK);
}
	
	@RequestMapping(
			value="addcategory/submit",
			 method = RequestMethod.POST,
	            consumes = MediaType.APPLICATION_JSON_VALUE,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Category> createCategory(
	            @RequestBody Category category) {
	    	logger.info("> createCategory");

	    	Category savedCategory = categoryservice.add(category);
	        
	        logger.info("< createCategory");
	        
	        return new ResponseEntity<Category>(savedCategory, HttpStatus.CREATED);
	    }
}
