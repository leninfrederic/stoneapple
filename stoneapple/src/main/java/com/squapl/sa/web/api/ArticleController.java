package com.squapl.sa.web.api;


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
import com.squapl.sa.service.ArticleService;

@RestController
public class ArticleController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	 @Autowired
	 private ArticleService articleService;
	 
	 /**
	     * Web service endpoint to fetch all Article entities. The service returns
	     * the collection of Article entities as JSON.
	     * 
	     * @return A ResponseEntity containing a Collection of Article objects.
	     */
	    @RequestMapping(
	            value = "/api/articles",
	            method = RequestMethod.GET,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Iterable<Article>> getArticles() {
	    	logger.info("> getArticles");
	    	
	        Iterable<Article> articles = articleService.findAll();
	       	
	        logger.info("< getArticles");
	       	
	        return new ResponseEntity<Iterable<Article>>(articles,
	                HttpStatus.OK);
	    }
	    
	    /**
	     * Web service endpoint to fetch a single Article entity by primary key
	     * identifier.
	     * 
	     * If found, the Article is returned as JSON with HTTP status 200.
	     * 
	     * If not found, the service returns an empty response body with HTTP status
	     * 404.
	     * 
	     * @param id A Long URL path variable containing the Article primary key
	     *        identifier.
	     * @return A ResponseEntity containing a single Article object, if found,
	     *         and a HTTP status code as described in the method comment.
	     */
	    @RequestMapping(
	            value = "/api/articles/{id}",
	            method = RequestMethod.GET,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Article> getArticle(@PathVariable("id") Long id) {
	    	logger.info("> getArticle id:{}", id);        

	        Article article = articleService.findOne(id);
	        if (article == null) {
	            return new ResponseEntity<Article>(HttpStatus.NOT_FOUND);
	        }
	        
	    	logger.info("< getArticle id:{}", id);
	        
	        return new ResponseEntity<Article>(article, HttpStatus.OK);
	    }
	    
	    
	    
	    @RequestMapping(
	            value = "/api/titles/{id}",
	            method = RequestMethod.GET,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Article> findbyTitle(@PathVariable("id") Long id) {
	    	logger.info("> getTitle id:{}", id);        

	        Article article = articleService.findOne(id);
	        if (article == null) {
	            return new ResponseEntity<Article>(HttpStatus.NOT_FOUND);
	        }
	        
	    	logger.info("< getTitle id:{}", id);
	        
	        return new ResponseEntity<Article>(article, HttpStatus.OK);
	    }	    
	    
	    
	    /**
	     * Web service endpoint to create a single Article entity. The HTTP request
	     * body is expected to contain a Article object in JSON format. The
	     * Article is persisted in the data repository.
	     * 
	     * If created successfully, the persisted Article is returned as JSON with
	     * HTTP status 201.
	     * 
	     * If not created successfully, the service returns an empty response body
	     * with HTTP status 500.
	     * 
	     * @param Article The Article object to be created.
	     * @return A ResponseEntity containing a single Article object, if created
	     *         successfully, and a HTTP status code as described in the method
	     *         comment.
	     */
	    @RequestMapping(
	            value = "/api/articles",
	            method = RequestMethod.POST,
	            consumes = MediaType.APPLICATION_JSON_VALUE,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Article> createArticle(
	            @RequestBody Article article) {
	    	logger.info("> createArticle");

	        Article savedArticle = articleService.create(article);
	        
	        logger.info("< createArticle");
	        
	        return new ResponseEntity<Article>(savedArticle, HttpStatus.CREATED);
	    }
	    
	    /**
	     * Web service endpoint to update a single Article entity. The HTTP request
	     * body is expected to contain a Article object in JSON format. The
	     * Article is updated in the data repository.
	     * 
	     * If updated successfully, the persisted Article is returned as JSON with
	     * HTTP status 200.
	     * 
	     * If not found, the service returns an empty response body and HTTP status
	     * 404.
	     * 
	     * If not updated successfully, the service returns an empty response body
	     * with HTTP status 500.
	     * 
	     * @param article The Article object to be updated.
	     * @return A ResponseEntity containing a single Article object, if updated
	     *         successfully, and a HTTP status code as described in the method
	     *         comment.
	     */
	    @RequestMapping(
	            value = "/api/articles/{id}",
	            method = RequestMethod.PUT,
	            consumes = MediaType.APPLICATION_JSON_VALUE,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Article> updateArtice(
	            @RequestBody Article article) {
	    	
	    	logger.info("> updateArticle id:{}", article.getIdarticle());

	        Article updatedArticle = articleService.update(article);
	        if (updatedArticle == null) {
	            return new ResponseEntity<Article>(
	                    HttpStatus.INTERNAL_SERVER_ERROR);
	        }

	        logger.info("< updateArticle id:{}", article.getIdarticle());
	        
	        return new ResponseEntity<Article>(updatedArticle, HttpStatus.OK);
	    }
	    
	    
	    
	    /**
	     * Web service endpoint to delete a single Article entity. The HTTP request
	     * body is empty. The primary key identifier of the Article to be deleted
	     * is supplied in the URL as a path variable.
	     * 
	     * If deleted successfully, the service returns an empty response body with
	     * HTTP status 204.
	     * 
	     * If not deleted successfully, the service returns an empty response body
	     * with HTTP status 500.
	     * 
	     * @param id A Long URL path variable containing the Article primary key
	     *        identifier.
	     * @return A ResponseEntity with an empty response body and a HTTP status
	     *         code as described in the method comment.
	     */
	    @RequestMapping(
	            value = "/api/articles/{id}",
	            method = RequestMethod.DELETE)
	    public ResponseEntity<Article> deleteArticle(
	            @PathVariable("id") Long id) {
	    
	    	logger.info("> deleteArticle id:{}", id);
	    	
	        articleService.delete(id);

	        logger.info("< deleteArticle id:{}", id);
	        
	        return new ResponseEntity<Article>(HttpStatus.NO_CONTENT);
	}
	    
    
}
