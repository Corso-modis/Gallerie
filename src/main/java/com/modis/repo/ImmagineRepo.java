package com.modis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modis.entities.Immagine;

public interface ImmagineRepo extends JpaRepository<Immagine, Long>{

}
