import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RotaPrivadaComponent } from './rota-privada.component';

describe('RotaPrivadaComponent', () => {
  let component: RotaPrivadaComponent;
  let fixture: ComponentFixture<RotaPrivadaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RotaPrivadaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RotaPrivadaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
