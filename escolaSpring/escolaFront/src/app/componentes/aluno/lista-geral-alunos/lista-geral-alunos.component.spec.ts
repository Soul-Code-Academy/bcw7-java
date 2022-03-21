import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaGeralAlunosComponent } from './lista-geral-alunos.component';

describe('ListaGeralAlunosComponent', () => {
  let component: ListaGeralAlunosComponent;
  let fixture: ComponentFixture<ListaGeralAlunosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaGeralAlunosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaGeralAlunosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
