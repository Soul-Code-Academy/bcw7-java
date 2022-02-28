import { Component, OnInit,  } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Aluno } from 'src/app/modelos/alunoModel';
import { AlunoService } from 'src/app/servicos/aluno.service';

@Component({
  selector: 'app-lista-geral-alunos',
  templateUrl: './lista-geral-alunos.component.html',
  styleUrls: ['./lista-geral-alunos.component.css']
})
export class ListaGeralAlunosComponent implements OnInit {

  alunos:any=[]

  search:any
  constructor(private alunoService:AlunoService, private route:ActivatedRoute){}


  ngOnInit(): void {
    this.buscarAlunos();
  }

  buscarAlunos(){
    this.alunoService.buscarTodosAlunos().subscribe(resultado =>{

      console.log(resultado)

      resultado.forEach((aluno: any=[]) =>{

        let alunosComTurma: any ={
          ra_aluno:'',
          al_nome:'',
          al_cidade: '',
          al_responsavel: '',
          tu_nome:'',
          tu_descricao:''
        }

        alunosComTurma.ra_aluno = aluno[0]
        alunosComTurma.al_nome = aluno[1]
        alunosComTurma.al_responsavel = aluno[1]
        alunosComTurma.al_cidade = aluno[2]
        alunosComTurma.tu_nome = aluno[3]
        alunosComTurma.tu_descricao = aluno[4]

        this.alunos.push(alunosComTurma)

      });


    })
  }

  resetSearch() {
  this.search = '';

}

}
