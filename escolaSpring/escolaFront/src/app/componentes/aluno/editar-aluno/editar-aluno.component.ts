import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Aluno } from 'src/app/modelos/alunoModel';
import { AlunoService } from 'src/app/servicos/aluno.service';

@Component({
  selector: 'app-editar-aluno',
  templateUrl: './editar-aluno.component.html',
  styleUrls: ['./editar-aluno.component.css']
})
export class EditarAlunoComponent implements OnInit {

  id_turma: any = ''

  aluno: Aluno = {
    ra_aluno:'',
    al_nome:'',
    al_responsavel:'',
    al_cidade:''
  }

  constructor(private alunoService:AlunoService,
    private route: ActivatedRoute,
    private router: Router) {
      this.aluno.ra_aluno = this.route.snapshot.paramMap.get('ra_aluno')
      this.id_turma = this.route.snapshot.paramMap.get('id_turma')!
     }

  ngOnInit(): void {
    this.mostrarUmAluno()
  }

  mostrarUmAluno(){
    this.alunoService.mostrarUmAluno(this.aluno.ra_aluno).subscribe((resposta)=>{
      this.aluno = resposta
      console.log(this.aluno)
    })
  }

  editarAluno() {
    this.alunoService.editarAluno(this.aluno,this.aluno.ra_aluno,this.id_turma ).subscribe({
      complete: () => {alert('Dados do aluno editados com sucesso!')
                      this.router.navigate([`alunoTurma/${this.id_turma}`])},
        error: () => {alert('Não foi possível editar os dados do aluno!')
                      this.router.navigate([`alunoTurma/${this.id_turma}`])}
         })
    }

    trocarTurma(){
      this.id_turma = prompt("Digite a turma para transferêcia: ", "id_turma")
      this.alunoService.editarAluno(this.aluno, this.aluno.ra_aluno, this.id_turma).subscribe({

        complete: () => {alert('Aluno transferido de turma!')
                      this.router.navigate([`alunoTurma/${this.id_turma}`])},
        error: () => alert('Erro ao transferir aluno!')

      })
  }

}
