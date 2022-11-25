package com.modis.service;

import java.util.List;

public interface GalleriaService {
	
	//public void save(Galleria galleria);
	public void save(String tiolo);
	public Galleria findById(long id);
	public List<String> printTitoli();
	//public void delete(Galleria galleria);
	public void deleteById(long id);
	
}
