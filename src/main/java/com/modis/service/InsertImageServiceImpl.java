package com.modis.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.modis.entities.Galleria;
import com.modis.entities.Immagine;
import com.modis.repo.GalleriaRepo;
import com.modis.repo.ImmagineRepo;

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
		Immagine immagine = immagineRepo.findById(idImmagine).get();
		immagine.setGalleria(galleria);
		immagineRepo.save(immagine);
	}
	
}
