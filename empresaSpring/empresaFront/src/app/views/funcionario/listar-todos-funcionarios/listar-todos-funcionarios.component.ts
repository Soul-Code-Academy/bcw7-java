
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FuncionarioService } from 'src/app/services/funcionario.service';


@Component({
  selector: 'app-listar-todos-funcionarios',
  templateUrl: './listar-todos-funcionarios.component.html',
  styleUrls: ['./listar-todos-funcionarios.component.css']
})
export class ListarTodosFuncionariosComponent implements OnInit {

  funcionarios:any=[]

  search:any

  funcionarioCadastrado: boolean = false

  isModal:boolean = false

constructor(private funcionarioService:FuncionarioService,
             private route:ActivatedRoute,
              private router:Router,
              private http:HttpClient){}


  ngOnInit(): void {
    this.mostrarTodosFuncionarios();
  }

  mostrarTodosFuncionarios(){
    this.funcionarioService.mostrarTodosFuncionarios().subscribe(res =>{
      res.forEach((funcionario:any=[])=>{
        let funcionariosGeral: any = {
          id_funcionario:'',
          func_nome: '',
          func_cpf:'',
          func_cidade:'',
          ca_nome:'',
          ca_atribuicao:'',
          // dep_nome:''
        }
          funcionariosGeral.id_funcionario = funcionario[0]
          funcionariosGeral.func_nome = funcionario[1]
          funcionariosGeral.func_cpf = funcionario[2]
          funcionariosGeral.func_cidade = funcionario[3]
          funcionariosGeral.ca_nome = funcionario[4]
          funcionariosGeral.ca_atribuicao = funcionario[5]
          // funcionariosGeral.dep_nome = funcionario[6]
          console.log(funcionariosGeral)


          if(funcionariosGeral.func_nome == undefined){
            funcionariosGeral=''
            funcionariosGeral.func_cpf  ='**'
            funcionariosGeral.func_cidade= '**'
            funcionariosGeral.ca_nome='***'
            funcionariosGeral.ca_atribuicao='***'
            // funcionariosGeral.dep_nome='***'
            this.funcionarioCadastrado=false
            this.funcionarios.push(funcionariosGeral)


          }else{
            this.funcionarioCadastrado=true
            this.funcionarios.push(funcionariosGeral)


          }
        })
    })
}



  resetSearch() {
    this.search = '';
  }

  mostrarModal(){
    this.isModal= true
  }

  cancelarAcao(){
    this.isModal=false
  }



}


