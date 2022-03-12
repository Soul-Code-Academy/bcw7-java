import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RotaPublicaComponent } from './rota-publica.component';

describe('RotaPublicaComponent', () => {
  let component: RotaPublicaComponent;
  let fixture: ComponentFixture<RotaPublicaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RotaPublicaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RotaPublicaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
