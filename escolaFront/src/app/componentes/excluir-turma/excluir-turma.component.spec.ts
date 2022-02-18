import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExcluirTurmaComponent } from './excluir-turma.component';

describe('ExcluirTurmaComponent', () => {
  let component: ExcluirTurmaComponent;
  let fixture: ComponentFixture<ExcluirTurmaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExcluirTurmaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ExcluirTurmaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
