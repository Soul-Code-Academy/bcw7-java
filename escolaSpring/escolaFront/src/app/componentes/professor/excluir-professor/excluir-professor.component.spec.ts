import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExcluirProfessorComponent } from './excluir-professor.component';

describe('ExcluirProfessorComponent', () => {
  let component: ExcluirProfessorComponent;
  let fixture: ComponentFixture<ExcluirProfessorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExcluirProfessorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ExcluirProfessorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
