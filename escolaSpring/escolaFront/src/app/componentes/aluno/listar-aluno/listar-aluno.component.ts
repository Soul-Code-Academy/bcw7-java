import { ActivatedRoute, Router } from '@angular/router';
import { AlunoService } from '../../../servicos/aluno.service';
import { Component, OnInit } from '@angular/core';
import { Aluno } from 'src/app/modelos/alunoModel';

@Component({
  selector: 'app-listar-aluno',
  templateUrl: './listar-aluno.component.html',
  styleUrls: ['./listar-aluno.component.css']
})
export class ListarAlunoComponent implements OnInit {

  id_turma: string = ''
  alunos:Aluno[]=[]
  search:any
  constructor(private alunoService:AlunoService, private route:ActivatedRoute, private router:Router) {  this.id_turma = this.route.snapshot.paramMap.get('id_turma')!; }

  ngOnInit(): void {

    this.buscarAlunoTurma();
  }

  buscarAlunoTurma(){
    this.alunoService.buscarAlunosTurma(this.id_turma).subscribe((resultado)=>{
      this.alunos = resultado;
      console.log(resultado)
    })
  }

  resetSearch() {
    this.search = '';
  }

}
