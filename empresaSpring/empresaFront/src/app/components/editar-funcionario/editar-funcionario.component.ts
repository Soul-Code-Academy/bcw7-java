import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Cargo } from 'src/app/models/cargoModelo';
import { Funcionario } from 'src/app/models/funcionarioModelo';
import { CargoService } from 'src/app/services/cargo.service';
import { FuncionarioService } from 'src/app/services/funcionario.service';

@Component({
  selector: 'app-editar-funcionario',
  templateUrl: './editar-funcionario.component.html',
  styleUrls: ['./editar-funcionario.component.css']
})
export class EditarFuncionarioComponent implements OnInit {

  isModal:boolean = false
  isModalCargo:boolean = false

  id_cargo: any = ''

  cargos: Cargo [] = []

  funcionario:Funcionario= {
    id_funcionario:'',
    func_nome:'',
    func_cidade:''
  }

  constructor(private funcionarioService:FuncionarioService,
    private route: ActivatedRoute,
    private router: Router,
    private cargoService: CargoService) {
      this.funcionario.id_funcionario = this.route.snapshot.paramMap.get('id_funcionario')
      this.id_cargo = this.route.snapshot.paramMap.get('id_cargo')
     }

  ngOnInit(): void {
    this.mostrarUmFuncionario()
    this.mostrarTodosCargos()
  }

  mostrarUmFuncionario(){
    this.funcionarioService.mostrarUmFuncionario(this.funcionario.id_funcionario).subscribe((resposta)=>{
      this.funcionario = resposta
      console.log(this.funcionario)
    })
  }

  editarFuncionario() {
    this.funcionarioService.editarFuncionario(this.funcionario, this.funcionario.id_funcionario, this.id_cargo).subscribe({
      complete: () => {alert('Dados do funcionário editados com sucesso!')
                      this.router.navigate([`funcionarioCargo/${this.id_cargo}`])},
      error: () => {alert('Não foi possível editar os dados do funcionário!'),
                    this.router.navigate([`funcionarioCargo/${this.id_cargo}`])},
    });

    }

    transferirCargo(){
      this.funcionarioService.editarFuncionario(this.funcionario, this.funcionario.id_funcionario,this.id_cargo).subscribe({
        complete: () => {alert('Funcionário transferido de cargo!')
                      this.router.navigate([`funcionarioCargo/${this.id_cargo}`])},
        error: () => alert('Erro na transferência.')

      })
      }

    cancelarAcao(){
      this.isModal=false
    }

    mostrarModal(){
      this.isModal = true
    }

    mostrarModalCargo(){
      this.isModalCargo = true
    }

    mostrarTodosCargos(){
      this.cargoService.mostrarTodosCargos().subscribe(resposta =>{
        this.cargos = resposta
        console.log(this.cargos)
      })
}
}
