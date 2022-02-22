import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Aluno } from 'src/app/modelos/alunoModel';
import { AlunoService } from 'src/app/servicos/aluno.service';
@Component({
  selector: 'app-excluir-aluno',
  templateUrl: './excluir-aluno.component.html',
  styleUrls: ['./excluir-aluno.component.css']
})
export class ExcluirAlunoComponent implements OnInit {

  id_turma: string = ''

  aluno: Aluno={
    ra_aluno:'',
    al_nome:'',
    al_responsavel:'',
    al_cidade:''
  }

  constructor(private alunoService:AlunoService, private activatedRoute:ActivatedRoute, private router:Router) {
    this.aluno.ra_aluno= this.activatedRoute.snapshot.paramMap.get('ra_aluno')
    this.id_turma = this.activatedRoute.snapshot.paramMap.get('id_turma')!
   }

  ngOnInit() {
    this.mostrarUmAluno();
  }


  mostrarUmAluno(){
    this.alunoService.mostrarUmAluno(this.aluno.ra_aluno).subscribe((resposta) => {
      this.aluno=resposta
      console.log(this.aluno)
      })

    }

    excluirAluno() {
      this.alunoService.excluirUmAluno(this.aluno.ra_aluno).subscribe({
        complete: () =>{alert("Aluno deletado com sucesso"),
                      this.router.navigate([`/alunoTurma/${this.id_turma}`])},
        error: () => {alert("Não foi possível deletar este aluno"),
                      this.router.navigate([`/alunoTurma/${this.id_turma}`])},


      })

    }

  }
