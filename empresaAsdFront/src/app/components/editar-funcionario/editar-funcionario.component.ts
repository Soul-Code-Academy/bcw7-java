import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Funcionario } from 'src/app/models/funcionarioModelo';
import { FuncionarioService } from 'src/app/services/funcionario.service';

@Component({
  selector: 'app-editar-funcionario',
  templateUrl: './editar-funcionario.component.html',
  styleUrls: ['./editar-funcionario.component.css']
})
export class EditarFuncionarioComponent implements OnInit {

  funcionario:Funcionario= {
    id_funcionario:'',
    func_nome:'',
    func_cidade:''
  }

  constructor(private funcionarioService:FuncionarioService,
    private route: ActivatedRoute,
    private router: Router) {
      this.funcionario.id_funcionario = this.route.snapshot.paramMap.get('id_funcionario')
     }

  ngOnInit(): void {
    this.mostrarUmFuncionario()
  }

  mostrarUmFuncionario(){
    this.funcionarioService.mostrarUmFuncionario(this.funcionario.id_funcionario).subscribe((resposta)=>{
      this.funcionario = resposta
      console.log(this.funcionario)
    })
  }

  editarFuncionario() {
    this.funcionarioService.editarFuncionario(this.funcionario).subscribe({
      complete: () => alert('Dados do funcionário editados com sucesso!'),
      error: () => alert('Não foi possível editar os dados do funcionário!'),
    });
    this.router.navigate(['/funcionarioCargo/:id_cargo']);
    }

}
