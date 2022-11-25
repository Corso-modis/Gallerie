package com.modis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modis.entities.Immagine;
import com.modis.service.ImmagineService;

@RestController
@RequestMapping("/immagine/api")
public class ImmagineController {
	
	@Autowired
	private ImmagineService immagineService;
	
	@GetMapping()
	public ResponseEntity<List<Immagine>> findAll(){
		List<Immagine> immagini = immagineService.findAll();
		return new ResponseEntity<>(immagini, HttpStatus.OK);
	}
}
