package com.modis.service;

import java.util.List;

public interface ImmagineService {
	public void save(Immagine immagine);
	public List<Immagine> findAll();
}
