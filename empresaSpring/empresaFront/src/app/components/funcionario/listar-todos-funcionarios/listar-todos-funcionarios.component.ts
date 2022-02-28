
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
  alunos:any=[]
  search:any

constructor(private funcionarioService:FuncionarioService,
             private route:ActivatedRoute,
              private router:Router){}


  ngOnInit(): void {
    this.mostrarTodosFuncionarios();
  }


  mostrarTodosFuncionarios(){
    this.funcionarioService.mostrarTodosFuncionarios().subscribe(res =>{

      res.forEach((funcionario:any=[])=>{

        let funcionariosGeral: any = {
          id_funcionario:'',
          func_nome: '',
          func_cidade:'',
          ca_nome:'',
          ca_atribuicao:''

        }

          funcionariosGeral.id_funcionario = funcionario[0]
          funcionariosGeral.func_nome = funcionario[1]
          funcionariosGeral.func_cidade = funcionario[2]
          funcionariosGeral.ca_nome = funcionario[3]
          funcionariosGeral.ca_atribuicao = funcionario[4]

        this.funcionarios.push(funcionariosGeral)
        console.log(funcionario)
      })

  })
}
resetSearch() {
  this.search = '';

  }

}


