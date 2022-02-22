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

  id_cargo: string = ''

 funcionario:Funcionario = {
    id_funcionario: '',
    func_nome: '',
    func_cidade: '',
  }

  constructor(private funcionarioService: FuncionarioService,
    private router: Router, private route: ActivatedRoute) {
      this.id_cargo = this.route.snapshot.paramMap.get('id_cargo')!
     }

  ngOnInit(): void {

  }

  cadastrarFuncionario(){
    this.funcionarioService.cadastrarFuncionario(this.funcionario, this.id_cargo).subscribe({
     complete: () =>  {alert("Funcionário Cadastrado no Cargo!"),
                          this.router.navigate([`/funcionarioCargo/${this.id_cargo}`])},
      error: () => {alert("Aconteceu um erro!")
                          this.router.navigate([`/funcionarioCargo/${this.id_cargo}`])},
      next: () =>{console.log("Funcionario cadastrado.")}

    })
  }


}
