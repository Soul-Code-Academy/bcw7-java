import { Location } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { Funcionario } from 'src/app/models/funcionarioModelo';
import { FuncionarioService } from 'src/app/services/funcionario.service';

@Component({
  selector: 'app-cadastrar-funcionario',
  templateUrl: './cadastrar-funcionario.component.html',
  styleUrls: ['./cadastrar-funcionario.component.css']
})
export class CadastrarFuncionarioComponent implements OnInit {

  idCadastrar!:any
  isModal:boolean = false

  foto: any
  idFuncCadastrado: any
  funcCadastrado:boolean=false

  cadastrado = false;
  error = false;

  anexada= false;
  erro = false;

  id_cargo: string = ''

 funcionario:Funcionario = {
    id_funcionario: '',
    func_nome: '',
    func_cidade: '',
    func_foto:'',
    func_cpf:''
  }

  constructor(private funcionarioService: FuncionarioService,
              private router: Router,
              private route: ActivatedRoute,
              private http:HttpClient,
              private location:Location ) {
      this.id_cargo = this.route.snapshot.paramMap.get('id_cargo')!
     }

  ngOnInit(): void {

  }

  // next: () => {this.cadastrado=true
  //   setTimeout(() => {
  //     this.router.navigate(['/departamento'])
  //   }, 2000)},
  // error: () => {this.error=true
  //   setTimeout(() => {
  //     this.router.navigate(['/departamento'])
  //   }, 2000)},
  // complete:() => setTimeout(() => {
  //     this.router.navigate(['/departamento'])
  //   }, 2000)

  // })


  cadastrarFuncionario(){
    this.funcionarioService.cadastrarFuncionario(this.funcionario, this.id_cargo).subscribe({
        next: () => {setTimeout(() => {
          this.cadastrado=true
          }, 2000)
          this.isModal= true
          this.funcionarioService.buscarFuncionarioPeloCpf(this.funcionario.func_cpf)
        .subscribe(resultado =>{
          console.log(resultado)
          this.idFuncCadastrado = resultado.id_funcionario
          this.funcCadastrado = true
        })},
      error: () => {alert("Erro: Não foi possível cadastrar o professor")}
    })
  }

  subirFoto(event:any){


    if(event.target.files && event.target.files[0]){
      this.foto = event.target.files[0]

      const formData = new FormData
      formData.append("foto",this.foto)

      const nome:string = this.funcionario.func_cpf + "-" + event.target.files[0].name

      this.http.post(`http://localhost:8080/empresa/envio/${this.idFuncCadastrado}?nomeDoArquivo=${nome}`,formData).subscribe({
        next: () => console.log("Foto enviada")
      })

      alert("Foto anexada ao Professor")


    }
  }



  cancelarAcao(){
    this.isModal=false
  }

  fechar(){
    this.cadastrado=false
    this.error=false
  }

  mostrarModal(func_cpf:any){
    this.isModal= true
    this.idCadastrar = func_cpf
  }
}
