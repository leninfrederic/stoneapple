package com.squapl.sa.service;

import java.util.Collection;

import com.squapl.sa.domain.Pictures;

public interface PicturesService {

	Collection<Pictures> findall();
	
	Pictures adding(Pictures pictures);
	
	Pictures findonebyid(Long Picid);
	
	Pictures update(Pictures pictures);
	
	void deleting(Long Picid);
}
