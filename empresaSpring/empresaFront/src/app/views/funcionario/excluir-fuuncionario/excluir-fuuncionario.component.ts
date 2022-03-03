import { Template } from '@angular/compiler/src/render3/r3_ast';
import { Component, OnInit, TemplateRef } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Funcionario } from 'src/app/models/funcionarioModelo';
import { FuncionarioService } from 'src/app/services/funcionario.service';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-excluir-fuuncionario',
  templateUrl: './excluir-fuuncionario.component.html',
  styleUrls: ['./excluir-fuuncionario.component.css']


})
export class ExcluirFuuncionarioComponent implements OnInit {

  isModalConfirmacao:boolean = false

  deletado = false;
  error = false;

 funcionario: Funcionario={
    id_funcionario:'',
    func_nome:'',
    func_cidade:'',
  }

  constructor(private funcionarioService:FuncionarioService,
              private activatedRoute:ActivatedRoute,
              private router:Router) {
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


      this.mostrarModalConfirmacao
      this.funcionarioService.excluirUmFuncionario(this.funcionario.id_funcionario).subscribe({
        next: () => {this.deletado=true},
        error: () => {this.error=true},
        complete:() => setTimeout(() => {
          this.router.navigate(["/listarCargos"])
        }, 2000)

      })

    }


    cancelarAcao(){
      this.isModalConfirmacao=false

    }

    mostrarModalConfirmacao(){
      this.isModalConfirmacao = true

       }


}
