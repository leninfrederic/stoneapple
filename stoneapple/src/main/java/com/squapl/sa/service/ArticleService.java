package com.squapl.sa.service;


import java.util.Collection;

import com.squapl.sa.domain.Article;

public interface ArticleService {

	Iterable<Article> findAll();
	
	Article	findOne(Long id);
	
	Article create(Article article);
	
	Article update(Article article);
	
	void delete(Long id);
	
	void evictCache();
	
	Article findbyTitle(Long id);
	
}
