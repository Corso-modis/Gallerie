package com.modis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public Galleria findById(long id) {
		return repo.findById(id);
	}

	@Override
	public List<String> printTitoli() {
		List<Galleria> gallerie = repo.findAll();
		gallerie.forEach(galleria -> System.out::println(galleria.getTitolo()));
	}

	@Override
	public void deleteById(long id) {
		repo.deleteById(id);
	}

}
