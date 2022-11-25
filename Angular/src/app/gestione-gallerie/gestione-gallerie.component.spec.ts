import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestioneGallerieComponent } from './gestione-gallerie.component';

describe('GestioneGallerieComponent', () => {
  let component: GestioneGallerieComponent;
  let fixture: ComponentFixture<GestioneGallerieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GestioneGallerieComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GestioneGallerieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
