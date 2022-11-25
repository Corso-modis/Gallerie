package com.modis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.modis.entities.Immagine;
import com.modis.repo.ImmagineRepo;



@Service
@Transactional
public class ImmagineServiceImpl implements ImmagineService{
	
	@Autowired
	private ImmagineRepo repo;
	
	public ImmagineServiceImpl(ImmagineRepo repo) {
		this.repo = repo;
	}

	@Override
	public void save(Immagine immagine) {
		repo.save(immagine);
	}

	@Override
	public List<Immagine> findAll() {
		return repo.findAll();
	}


}
