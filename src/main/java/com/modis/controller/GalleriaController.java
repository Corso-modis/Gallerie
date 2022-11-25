package com.modis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modis.entities.Galleria;
import com.modis.service.GalleriaService;
import com.modis.service.InsertImageService;

@RestController
@RequestMapping("/galleria/api")
public class GalleriaController {
	
	@Autowired
	private GalleriaService galleriaService;
	@Autowired
	private InsertImageService insertService;
	
//	@GetMapping()
//	public ResponseEntity<List<String>> printTitoli(){
//		List<String> titoli = galleriaService.printTitoli();
//		return new ResponseEntity<>(titoli,HttpStatus.OK);
//	}
	@GetMapping()
	public ResponseEntity<List<Galleria>> findAll(){
		List<Galleria> titoli = galleriaService.findAll();
		return new ResponseEntity<>(titoli,HttpStatus.OK);
	}
	
	@PostMapping("/{titolo}")
	public ResponseEntity<String> save(@PathVariable String titolo){
		Galleria galleria = new Galleria();
		galleria.setTitolo(titolo);
		galleriaService.save(galleria);
		return new ResponseEntity<>("Galleria salvata", HttpStatus.CREATED);
	}
	
	@PostMapping("/add/{titoloGalleria}/{idImmagine}")
	public ResponseEntity<String> addImmagine(@PathVariable String titoloGalleria, @PathVariable long idImmagine ){
		insertService.insertImage(titoloGalleria, idImmagine);
		return new ResponseEntity<>("Inserimento completato", HttpStatus.OK);
	}
	
	@PostMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable long id){
		galleriaService.deleteById(id);
		return new ResponseEntity<>("Eliminazione completata", HttpStatus.OK);	
	}
	
	

}
