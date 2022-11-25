package com.modis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ImmagineServiceImpl implements ImmagineService{
	
	@Autowired
	private ImmagineRepo repo;
	
	public ImmagineRepoImpl(ImmagineRepo repo) {
		this.repo = repo;
	}

	@Override
	public void save(Immagine immagine) {
		repo.save(immagine);
	}

	@Override
	public List<Immagine> findAll() {
		return  repo.findAll();
	}

}
