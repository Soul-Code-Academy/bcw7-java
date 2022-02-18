import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Turma } from 'src/app/modelos/turmaModel';
import { TurmaService } from 'src/app/servicos/turma.service';

@Component({
  selector: 'app-excluir-turma',
  templateUrl: './excluir-turma.component.html',
  styleUrls: ['./excluir-turma.component.css']
})
export class ExcluirTurmaComponent implements OnInit {

  turma: Turma={
    id_turma:'',
    tu_descricao:'',
    tu_nome:''
  }
  constructor(private turmaService:TurmaService, private activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.turma.id_turma = this.activatedRoute.snapshot.paramMap.get('id')
    this.mostrarUmaTurma();
  }

  mostrarUmaTurma(){
    this.turmaService.mostrarUmaTurma(this.turma.id_turma).subscribe((resultado)=>{
      this.turma = resultado
    })
  }

}
