import { Aluno } from 'src/app/modelos/alunoModel';
import { Component, OnInit } from '@angular/core';
import { AlunoService } from 'src/app/servicos/aluno.service';
import { Router, ActivatedRoute } from '@angular/router';




@Component({
  selector: 'app-cadastrar-aluno',
  templateUrl: './cadastrar-aluno.component.html',
  styleUrls: ['./cadastrar-aluno.component.css'],


})
export class CadastrarAlunoComponent implements OnInit {



  
  alunoCadastrado=false

  form:any

  id_turma: string = ''

  aluno:Aluno = {
    ra_aluno:'',
    al_nome:'',
    al_responsavel: '',
    al_cidade:''
  }



  constructor(private alunoService: AlunoService,
              private router: Router,
              private route: ActivatedRoute) {
      this.id_turma = this.route.snapshot.paramMap.get('id_turma')!


     }

  ngOnInit(): void {


 }


    cadastrarAluno(value: any){
      console.log(value);
    this.alunoService.cadastrarAluno(this.aluno, this.id_turma).subscribe({
     complete: () =>  {alert("Aluno Cadastrado na Turma!")
                         this.router.navigate([`/alunoTurma/${this.id_turma}`])},
      error: () => {alert("Aconteceu um erro!")
                          this.router.navigate([`/alunoTurma/${this.id_turma}`])},
      next: () =>{console.log("Aluno cadastrado.")}

    })



  }




}
