package com.modis.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Galleria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titolo;
	
	@OneToMany(mappedBy = "galleria")
	private List<Immagine> immagini;

	public Galleria(String titolo) {
		super();
		this.titolo = titolo;
	}

	public Galleria() {
		super();
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public List<Immagine> getImmagini() {
		return immagini;
	}

	public void setImmagini(List<Immagine> immagini) {
		this.immagini = immagini;
	}

	@Override
	public String toString() {
		return "Galleria [id=" + id + ", titolo=" + titolo + ", immagini=" + immagini + "]";
	}
	
}
