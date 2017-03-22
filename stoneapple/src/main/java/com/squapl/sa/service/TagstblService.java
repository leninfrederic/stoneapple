package com.squapl.sa.service;

import java.util.Collection;

import com.squapl.sa.domain.Category;
import com.squapl.sa.domain.Tagstbl;

public interface TagstblService {


	Collection<Tagstbl> findall();
 
	Tagstbl adding(Tagstbl tagstbl);
	
	Tagstbl findonebyid(Long idtag);
	
	void deleting(Long idtag);
	
	Tagstbl update(Tagstbl tagstbl);

	
}
