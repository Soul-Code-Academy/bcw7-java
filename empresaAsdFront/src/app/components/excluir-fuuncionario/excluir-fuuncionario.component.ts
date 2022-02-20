import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Funcionario } from 'src/app/models/funcionarioModelo';
import { FuncionarioService } from 'src/app/services/funcionario.service';

@Component({
  selector: 'app-excluir-fuuncionario',
  templateUrl: './excluir-fuuncionario.component.html',
  styleUrls: ['./excluir-fuuncionario.component.css']
})
export class ExcluirFuuncionarioComponent implements OnInit {

 funcionario: Funcionario={
    id_funcionario:'',
    func_nome:'',
    func_cidade:'',
  }

  constructor(private funcionarioService:FuncionarioService, private activatedRoute:ActivatedRoute, private router:Router) {
    this.funcionario.id_funcionario= this.activatedRoute.snapshot.paramMap.get('id_funcionario')
   }

  ngOnInit() {
    this.mostrarUmFuncionario();
  }


  mostrarUmFuncionario(){
    this.funcionarioService.mostrarUmFuncionario(this.funcionario.id_funcionario).subscribe((resposta) => {
      this.funcionario=resposta
      console.log(this.funcionario)
      })

    }

    excluirFuncionario() {
      this.funcionarioService.excluirUmFuncionario(this.funcionario.id_funcionario).subscribe({
        next: () => {alert("Funcionário deletado com sucesso!")},
        error: () => {alert("Não foi possível deletar este funcionário.")},
        complete: () => {this.router.navigate(["/listarCargos"])}

      })

    }
}
