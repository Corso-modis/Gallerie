package com.modis.service;

import java.util.List;

import com.modis.entities.Immagine;

public interface ImmagineService {
	public void save(Immagine immagine);
	public List<Immagine> findAll();
}
