import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CargoAoDepartamentoComponent } from './cargo-ao-departamento.component';

describe('CargoAoDepartamentoComponent', () => {
  let component: CargoAoDepartamentoComponent;
  let fixture: ComponentFixture<CargoAoDepartamentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CargoAoDepartamentoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CargoAoDepartamentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
