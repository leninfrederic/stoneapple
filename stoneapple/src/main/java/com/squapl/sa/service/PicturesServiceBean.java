package com.squapl.sa.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.squapl.sa.domain.Pictures;
import com.squapl.sa.domain.PicturesRepository;

@Service
public class PicturesServiceBean implements PicturesService {
	
	@Autowired
	private PicturesRepository picturesrepository;

	@Override
	public Collection<Pictures> findall() {
		Collection<Pictures> allpictures = picturesrepository.findAll();
		// TODO Auto-generated method stub
		return allpictures;
	}

	@Override
	public Pictures adding(Pictures pictures) {
		Pictures savedPictures = picturesrepository.save(pictures);
		// TODO Auto-generated method stub
		return savedPictures;
	}

	@Override
	public Pictures findonebyid(Long Picid) {
		Pictures pictures = picturesrepository.findOne(Picid);
		// TODO Auto-generated method stub
		return pictures;
	}

	@Override
	public void deleting(Long Picid) {
		picturesrepository.delete(Picid);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pictures update(Pictures pictures) {
		Pictures updatedpictures = picturesrepository.save(pictures);
		// TODO Auto-generated method stub
		return updatedpictures;
	}

}
