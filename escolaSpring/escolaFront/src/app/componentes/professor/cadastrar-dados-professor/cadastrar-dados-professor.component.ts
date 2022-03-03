import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Professor } from 'src/app/modelos/professorModel';
import { ProfessorService } from 'src/app/servicos/professor.service';

@Component({
  selector: 'app-cadastrar-dados-professor',
  templateUrl: './cadastrar-dados-professor.component.html',
  styleUrls: ['./cadastrar-dados-professor.component.css']
})
export class CadastrarDadosProfessorComponent implements OnInit {
  id_turma: any
  professorCadastrado: boolean = false

  professoresSemTurma:any
  professorSemTurma:any=[]

  professor:Professor ={
      id_professor: '',
      pro_nome: '',
      pro_formacao: '',
      pro_foto:''
  }



  constructor(private professorService:ProfessorService,
    private route:ActivatedRoute,
    private router:Router ) {}


  ngOnInit(): void {

  }

    cadastrarProfessor(){
      this.professorService.cadastrarProfessor(this.professor).subscribe((resultado:any)=>{
        alert("Professor Cadastrado com Sucesso!")
        this.router.navigate(['/professor'])
      })
    }


  }







