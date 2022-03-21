import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarBoletoComponent } from './listar-boleto.component';

describe('ListarBoletoComponent', () => {
  let component: ListarBoletoComponent;
  let fixture: ComponentFixture<ListarBoletoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarBoletoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarBoletoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
