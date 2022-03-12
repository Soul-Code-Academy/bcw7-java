import { Component, OnInit } from '@angular/core';
import { Funcionario } from 'src/app/models/funcionarioModelo';
import { FuncionarioService } from 'src/app/services/funcionario.service';

@Component({
  selector: 'app-listar-dados',
  templateUrl: './listar-dados-funcionario.component.html',
  styleUrls: ['./listar-dados-funcionario.component.css']
})
export class ListarDadosFuncionarioComponent implements OnInit {

  funcionarios:any=[]

  funcionarioCadastrado: boolean = false
  search:any

  constructor(private funcionarioService:FuncionarioService) {

  }

  ngOnInit(): void {

    this.funcionarioService.buscarTodosFuncionarios().subscribe(res =>{
      res.forEach((funcionario:any=[])=>{
        let funcionariosGeral: any = {
          id_funcionario:'',
          func_foto:'',
          func_nome: '',
          func_cpf:'',
          func_dataNascimento:'',
          func_telefone:'',
          func_email:'',
          func_cep:'',
          func_cidade:'',
          func_estado:'',
          func_rua:'',
          func_numero:'',
          ca_nome:'',
          ca_atribuicao:'',
          dep_nome:'',
          func_bairro:'',
          func_referencia:''
        }
          funcionariosGeral.id_funcionario = funcionario[0]
          funcionariosGeral.func_foto = funcionario[1]
          funcionariosGeral.func_nome = funcionario[2]
          funcionariosGeral.func_cpf = funcionario[3]
          // funcionariosGeral.func_dataNascimento = funcionario[3]
          funcionariosGeral.func_telefone = funcionario[4]
          funcionariosGeral.func_email = funcionario[5]
          funcionariosGeral.func_cep= funcionario[6]
          funcionariosGeral.func_cidade = funcionario[7]
          funcionariosGeral.func_bairro = funcionario[8]
          funcionariosGeral.func_rua = funcionario[9]
          funcionariosGeral.func_numero = funcionario[10]
          funcionariosGeral.func_referencia= funcionario[11]
          funcionariosGeral.func_estado = funcionario[12]
          funcionariosGeral.ca_nome = funcionario[13]
          funcionariosGeral.ca_atribuicao = funcionario[14]
          // funcionariosGeral.dep_nome = funcionario[12]

          if(funcionariosGeral.func_nome == undefined){
            funcionariosGeral.func_foto = '***'
            funcionariosGeral.func_nome = '***'
            funcionariosGeral.func_cpf = '***'
            funcionariosGeral.func_telefone = '***'
            funcionariosGeral.func_email = '***'
            funcionariosGeral.func_cidade = '***'
            funcionariosGeral.func_estado = '***'
            funcionariosGeral.func_rua = '***'
            funcionariosGeral.ca_nome = '***'
            funcionariosGeral.ca_atribuicao = '***'
            funcionariosGeral.dep_nome = '***'
            funcionariosGeral.func_bairro = '***'
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


  }


