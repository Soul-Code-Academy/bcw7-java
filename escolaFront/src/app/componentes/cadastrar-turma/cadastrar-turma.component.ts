import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Turma } from 'src/app/modelos/turmaModel';
import { TurmaService } from 'src/app/servicos/turma.service';

@Component({
  selector: 'app-cadastrar-turma',
  templateUrl: './cadastrar-turma.component.html',
  styleUrls: ['./cadastrar-turma.component.css']
})
export class CadastrarTurmaComponent implements OnInit {

  turma:Turma = {
    tu_nome: '',
    tu_descricao: ''
  }

  constructor(private turmaService: TurmaService,
    private router: Router) { }

  ngOnInit(): void {
  }

  cadastrarTurma(){
    this.turmaService.cadastrarTurma(this.turma).subscribe((resultado)=>{
      alert("Turma Cadastrada com sucesso!")
      this.router.navigate(['/turma'])
    })
  }

}
