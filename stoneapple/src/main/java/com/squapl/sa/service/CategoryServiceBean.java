package com.squapl.sa.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.squapl.sa.domain.Category;
import com.squapl.sa.domain.CategoryRepository;


@Service
public class CategoryServiceBean implements CategoryService {

	@Autowired
	private CategoryRepository categoryrepository;

	@Override
	public Category adding(Category category) {
		Category savedCategory =  categoryrepository.save(category);
		// TODO Auto-generated method stub
		return savedCategory;
	}

	@Override
	public Collection<Category> findall() {
		// TODO Auto-generated method stub
		Collection<Category> categories = categoryrepository.findAll();
		return categories;
	}

	@Override
	public Category findonebyid(Long idcategory) {
		Category category = categoryrepository.findOne(idcategory);
		return category;
	}
	
	@Override
	public void deleting(Long idcategory){
		categoryrepository.delete(idcategory);
	}
}
