import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Turma } from 'src/app/modelos/turmaModel';
import { TurmaService } from 'src/app/servicos/turma.service';

@Component({
  selector: 'app-cadstrar-turma',
  templateUrl: './cadstrar-turma.component.html',
  styleUrls: ['./cadstrar-turma.component.css']
})
export class CadstrarTurmaComponent implements OnInit {

  turma:Turma = {
    tu_nome: '',
    tu_descricao: '',
    id_turma: ''
  }

  constructor(private turmaService:TurmaService, private router:Router) { }

  ngOnInit(): void {
  }

  cadastrarTurma(){
    this.turmaService.cadastrarTurma(this.turma).subscribe((resultado)=>{
      alert("Turma cadastrada!")
      this.router.navigate(['/turma'])
    })
  }

}
