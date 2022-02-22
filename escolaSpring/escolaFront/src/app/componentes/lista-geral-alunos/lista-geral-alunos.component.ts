import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Aluno } from 'src/app/modelos/alunoModel';
import { AlunoService } from 'src/app/servicos/aluno.service';

@Component({
  selector: 'app-lista-geral-alunos',
  templateUrl: './lista-geral-alunos.component.html',
  styleUrls: ['./lista-geral-alunos.component.css']
})
export class ListaGeralAlunosComponent implements OnInit {

  aluno: string = ''
  alunos:Aluno[]=[]

  constructor(private alunoService:AlunoService, private route:ActivatedRoute, private router:Router){}


  ngOnInit(): void {

    this.buscarAlunos();
  }

  buscarAlunos(){
    this.alunoService.buscarTodosAlunos().subscribe((resultado)=>{
      this.alunos = resultado;
    })
  }


}
