import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Professor } from 'src/app/modelos/professorModel';
import { Turma } from 'src/app/modelos/turmaModel';
import { ProfessorService } from 'src/app/servicos/professor.service';
import { TurmaService } from 'src/app/servicos/turma.service';

@Component({
  selector: 'app-cadastrar-professor-turma',
  templateUrl: './cadastrar-professor-turma.component.html',
  styleUrls: ['./cadastrar-professor-turma.component.css']
})
export class CadastrarProfessorTurmaComponent implements OnInit {

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

  turma:Turma={
    id_turma:'',
    tu_nome:'',
    tu_descricao:''
   }

  constructor(private professorService:ProfessorService,
    private route:ActivatedRoute,
    private router:Router,
    private turmaService:TurmaService) {
        this.id_turma = this.route.snapshot.paramMap.get('id_turma')! }


  ngOnInit(): void {
    this.buscarProfessorComTurma()

    this.professorService.buscarProfessorSemTurma().subscribe((resultado)=>{
      this.professoresSemTurma = resultado
    })

    this.professor = this.professorSemTurma
  }

  buscarProfessorComTurma(){
    this.professorService.buscarProfessorComTurma(this.id_turma).subscribe((resultado:any)=>{
      if(resultado == undefined){
        // alert("Turma sem professor!")
        this.professorCadastrado=false
      }else{
        this.professorCadastrado=true
        this.professor = resultado;
      }
    })
  }

  mostrarProfessor(){
    this.professorService.buscarProfessorSemTurma().subscribe((resultado:any)=>{
      this.professor= this.professorSemTurma;
      console.log(this.professorSemTurma)

    })
  }

  atribuirProfessor(){

    this.turmaService.mostrarUmaTurma(this.id_turma).subscribe((resultado)=>{
      this.turma = resultado

    })

    this.turmaService.atribuirProfessor(this.turma, this.id_turma,this.professor.id_professor).subscribe({
      complete: () => {alert("O professor foi atribuído para a turma")
                      this.router.navigate(['/turma'])},
      error: () => {alert("Erro: o professor não foi atribuído")
                    this.router.navigate(['/turma']) }
    })



  }

  deixarTurmaSemProfessor(){
    this.turmaService.deixarTurmaSemProfessor (this.turma, this.id_turma,this.professor.id_professor).subscribe({
      complete: () => {alert("A turma agora está sem Professor")
                      this.router.navigate(['/turma'])},
      error: () => {alert("Erro: o professor não foi retirado da turma")
                    this.router.navigate(['/turma']) }
    })
  }




}
