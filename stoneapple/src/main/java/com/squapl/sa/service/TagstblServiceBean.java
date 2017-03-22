package com.squapl.sa.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squapl.sa.domain.Article;
import com.squapl.sa.domain.Category;
import com.squapl.sa.domain.Tagstbl;
import com.squapl.sa.domain.TagstblRepository;

@Service
public class TagstblServiceBean implements TagstblService {
	
	@Autowired
	private TagstblRepository tagstblrepository;
	
	@Override
	public Collection<Tagstbl> findall() {
		Collection<Tagstbl> tagstables = tagstblrepository.findAll();
		// TODO Auto-generated method stub
		return tagstables;
	}

	@Override
	public Tagstbl adding(Tagstbl tagstbl) {
		Tagstbl savedTagstbl =  tagstblrepository.save(tagstbl);

		// TODO Auto-generated method stub
		return savedTagstbl;
	}

	@Override
	public Tagstbl findonebyid(Long idtag) {
		// TODO Auto-generated method stub
		Tagstbl tagstbl = tagstblrepository.findOne(idtag);
		return tagstbl;
	}

	@Override
	public void deleting(Long idtag) {
		tagstblrepository.delete(idtag);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tagstbl update(Tagstbl tagstbl) {
		// TODO Auto-generated method stub
		Tagstbl tagstblPersisted = findonebyid(tagstbl.getIdtags());

		Tagstbl updatedtagstbl = tagstblrepository.save(tagstbl);
		return updatedtagstbl;
	}

}
