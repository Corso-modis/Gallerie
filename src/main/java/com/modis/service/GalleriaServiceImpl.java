package com.modis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.modis.entities.Galleria;
import com.modis.repo.GalleriaRepo;

@Service
@Transactional
public class GalleriaServiceImpl implements GalleriaService{
	
	@Autowired
	private GalleriaRepo repo;
	
	public GalleriaServiceImpl(GalleriaRepo repo) {
		this.repo = repo;
	}

	@Override
	public void save(String titolo) {
		repo.save(repo.findByTitolo(titolo));
	}
	
	@Override
	public void save(Galleria galleria) {
		repo.save(galleria);
	}

	@Override
	public Galleria findById(long id) {
		return repo.findById(id).orElseThrow();
	}

	@Override
	public List<String> printTitoli() {
		List<Galleria> gallerie = repo.findAll();
		List<String> titoli = null;
		for(int i = 0; i < gallerie.size(); i++) {
			titoli.add(gallerie.get(i).getTitolo());
		}
		return titoli;
	}

	@Override
	public void deleteById(long id) {
		repo.deleteById(id);
	}

	@Override
	public List<Galleria> findAll() {
		return repo.findAll();
	}

	

}
