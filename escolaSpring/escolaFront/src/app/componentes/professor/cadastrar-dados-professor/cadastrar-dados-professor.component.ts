import { HttpClient } from '@angular/common/http';
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

  foto: any
  idProfCadastrado: any
  profCadastrado:boolean=false

  professor:Professor ={
      id_professor: '',
      pro_nome: '',
      pro_formacao: '',
      pro_foto:'',
      pro_cpf:''
  }



  constructor(private professorService:ProfessorService,
    private route:ActivatedRoute,
    private router:Router,
    private http:HttpClient ) {}


  ngOnInit(): void {

  }

    cadastrarProfessor(){
      this.professorService.cadastrarProfessor(this.professor).subscribe({
        complete:() => {alert("Professor Cadastrado com Sucesso!")
        this.professorService.buscarProfessorPeloCpf(this.professor.pro_cpf)

.subscribe(resultado=>{

                       console.log(resultado)
                        this.idProfCadastrado = resultado.id_professor
                        console.log(resultado.id_professor)
                        this.profCadastrado = true

    })},
        error: () => {alert("Erro! Professor professor não cadastrado.")},
      })

    }

    subirFoto(event:any){
      if(event.target.files && event.target.files[0]){
        this.foto = event.target.files[0]

       const formData = new FormData
        formData.append("foto", this.foto)

        const nome:string = this.professor.pro_cpf + "-" + event.target.files[0].name

        this.http.post(`http://localhost:8181/escola/envio/${this.idProfCadastrado}?nomeDoArquivo=${nome}`,formData).subscribe({
          complete: () => console.log("Foto enviada!")
        })

        alert("Foto anexada!")

    }


  }






}

