import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadstrarTurmaComponent } from './cadstrar-turma.component';

describe('CadstrarTurmaComponent', () => {
  let component: CadstrarTurmaComponent;
  let fixture: ComponentFixture<CadstrarTurmaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CadstrarTurmaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CadstrarTurmaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
