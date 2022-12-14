package com.modis.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Immagine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titolo;
	private String url;
	
	@JsonIgnore
	@JoinColumn
	@ManyToOne
	private Galleria galleria;

	public Immagine(String titolo, String url) {
		super();
		this.titolo = titolo;
		this.url = url;
	}

	public Immagine() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Galleria getGalleria() {
		return galleria;
	}

	public void setGalleria(Galleria galleria) {
		this.galleria = galleria;
	}
	
	
}
