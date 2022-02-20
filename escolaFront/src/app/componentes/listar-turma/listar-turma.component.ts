import { Component, OnInit } from '@angular/core';
import { TurmaService } from 'src/app/servicos/turma.service';
import { Turma } from 'src/app/modelos/turmaModel';

@Component({
  selector: 'app-listar-turma',
  templateUrl: './listar-turma.component.html',
  styleUrls: ['./listar-turma.component.css']
})
export class ListarTurmaComponent implements OnInit {

turmas: Turma [] = []

  constructor(private turmaService: TurmaService) { }

  ngOnInit(): void {
    this.mostrarTodasTurmas();
  }

  mostrarTodasTurmas(){
    this.turmaService.mostrarTodasTurmas().subscribe(resposta =>{
      this.turmas = resposta
    })
  }



}
