package com.squapl.sa.service;

import java.util.Collection;

import com.squapl.sa.domain.Article;
import com.squapl.sa.domain.Category;

public interface CategoryService {

	Collection<Category> findAll();
 
	Category add(Category category);

}
