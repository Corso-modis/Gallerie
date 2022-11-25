package com.modis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InsertImageServiceImpl implements InsertImageService{
	@Autowired
	private GalleriaRepo galleriaRepo;
	@Autowired
	private ImmagineRepo immagineRepo;
	
	public InsertImageServiceImpl(GalleriaRepo galleriaRepo, ImmagineRepo immagineRepo) {
		this.galleriaRepo = galleriaRepo;
		this.immagineRepo = immagineRepo;
	}
	@Override
	public void insertImage(String titoloGalleria, long idImmagine) {
		Galleria galleria = galleriaRepo.findByTitolo(titoloGalleria);
		Immagine immagine = immagineRepo.findById(idImmagine);
		galleria.getImmagini().add(immagine);
	}
	
}
