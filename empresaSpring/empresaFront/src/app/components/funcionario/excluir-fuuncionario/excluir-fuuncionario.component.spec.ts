import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExcluirFuuncionarioComponent } from './excluir-fuuncionario.component';

describe('ExcluirFuuncionarioComponent', () => {
  let component: ExcluirFuuncionarioComponent;
  let fixture: ComponentFixture<ExcluirFuuncionarioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExcluirFuuncionarioComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ExcluirFuuncionarioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
