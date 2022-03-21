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

  professorCadastrado: boolean = false

  id_turma:string
  professores:any=[]

  search:any

  constructor(private professorService:ProfessorService,
              private route:ActivatedRoute,
              private router:Router) {
     this.professores.id_professor= this.route.snapshot.paramMap.get('id_professor')
     this.id_turma = this.route.snapshot.paramMap.get('id_turma')!; }

  ngOnInit(): void {
    this.buscarProfessorTurma();
  }

  buscarProfessorTurma(){
    this.professorService.buscarTodosProfessores().subscribe((resultado:any)=>{
      resultado.forEach((professor: any=[]) =>{

        let profs: any ={
          id_professor:'',
          // pro_foto:'',
          pro_cpf:'',
          pro_nome:'',
          pro_formacao: '',
          tu_turma: '',
        }

        profs.id_professor = professor[0]
        // profs.pro_foto = professor[1]
        profs.pro_cpf = professor[1]
        profs.pro_nome = professor[2]
        profs.pro_formacao = professor[3]
        profs.tu_turma = professor[4]

        if(profs.tu_turma  == undefined){
          profs.tu_turma='Professor sem turma.'
          this.professorCadastrado=false
          this.professores.push(profs)
        }else{
          this.professorCadastrado=true
          this.professores.push(profs)

      }

  })

})

}


  resetSearch(){
    this.search=''
  }



}
