import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Professor } from 'src/app/modelos/professorModel';
import { ProfessorService } from 'src/app/servicos/professor.service';

@Component({
  selector: 'app-listar-professor',
  templateUrl: './listar-professor.component.html',
  styleUrls: ['./listar-professor.component.css']
})
export class ListarProfessorComponent implements OnInit {

  id_turma:string
  professores:Professor[]=[]

  constructor(private professorService:ProfessorService, private route:ActivatedRoute, private router:Router) {
     this.id_turma = this.route.snapshot.paramMap.get('id_turma')!; }

  ngOnInit(): void {

    this.buscarProfessorTurma();
  }

  buscarProfessorTurma(){
    this.professorService.buscarProfessorTurma(this.id_turma).subscribe((resultado:any)=>{
      this.professores = resultado;
      console.log(resultado)
    })
  }



}
