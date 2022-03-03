import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarDadosProfessorComponent } from './cadastrar-dados-professor.component';

describe('CadastrarDadosProfessorComponent', () => {
  let component: CadastrarDadosProfessorComponent;
  let fixture: ComponentFixture<CadastrarDadosProfessorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CadastrarDadosProfessorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastrarDadosProfessorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
