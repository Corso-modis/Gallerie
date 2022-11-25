import { Component } from '@angular/core';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

type Immagine = {
  id: number;
  titolo: string;
  url: string;
};

type Galleria = {
  id: number;
  titolo: string;
  immagini: Immagine[];
};

type InsertImage = {
  titoloGalleria: string;
  idImmagine: number;
};

@Injectable({
  providedIn: 'root',
})
@Component({
  selector: 'app-gestione-gallerie',
  templateUrl: './gestione-gallerie.component.html',
  styleUrls: ['./gestione-gallerie.component.css'],
})
export class GestioneGallerieComponent {
  save = false;
  listaGallerie = true;
  editing = false;
  info = false;

  galleria = {
    id: 0,
    titolo: '',
    immagini: [
      {
        id: 0,
        url: '',
        titolo: '',
      },
    ],
  };

  immagini!: Immagine[];

  gallerie!: Galleria[];

  constructor(private http: HttpClient) {}

  loadImmagini() {
    this.http
      .get('http://localhost:8080/immagine/api/all')
      .subscribe((data: any) => {
        this.immagini = data as Immagine[];
      });
    console.log(this.immagini);
  }

  loadGallerie() {
    this.http
      .get('http://localhost:8080/galleria/api/all')
      .subscribe((data: any) => {
        this.gallerie = data as Galleria[];
      });
  }

  sendGalleria(galleria: any) {
    this.galleria = galleria;
    this.galleria.immagini = [];
    this.http
      .post('http://localhost:8080/galleria/api/' + galleria.titolo, null)
      .subscribe(() => this.loadGallerie());
    this.loadGallerie();
    this.toggleForm();
  }

  sendImmagine(titoloGalleria: string, idImmagine: number) {
    this.http
      .post(
        'http://localhost:8080/galleria/api/add/' +
          titoloGalleria +
          '/' +
          idImmagine,
        null
      )
      .subscribe(() => this.loadImmagini());
    this.loadGallerie();
    console.log(this.gallerie);
    
    this.gallerie.forEach((element) => {
      if (element.titolo == titoloGalleria) {
        this.galleria = element;  
      }
    });
  }

  toggleForm() {
    if (this.save == false) {
      this.save = true;
    } else {
      this.save = false;
    }
  }

  infoGalleria(galleria: any) {
    this.info = true;
    this.listaGallerie = false;
    this.galleria = galleria;
    console.log(this.galleria);
  }

  editingGalleria(galleria: any) {
    this.editing = true;
    this.listaGallerie = false;
    this.galleria = galleria;
    this.loadImmagini();
  }

  mostraLista() {
    this.listaGallerie = true;
    this.info = false;
    this.editing = false;
  }
}
