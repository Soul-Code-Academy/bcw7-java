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

  transferido = false;
  error = false;

  editado = false;
  erro = false;

  isModal:boolean = false
  isModalCargo:boolean = false

  id_cargo: any = ''

  cargos: Cargo [] = []

  funcionario:Funcionario= {
    id_funcionario:'',
    func_nome:'',
    func_cidade:'',
    func_foto:'',
    func_cpf:''
  }

  constructor(private funcionarioService:FuncionarioService,
    private route: ActivatedRoute,
    private router: Router,
    private cargoService: CargoService) {
      this.funcionario.id_funcionario = this.route.snapshot.paramMap.get('id_funcionario')
      this.id_cargo = this.route.snapshot.paramMap.get('id_cargo')
     }

  ngOnInit(): void {
    this.funcionarioService.mostrarUmFuncionario(this.funcionario.id_funcionario).subscribe((resposta)=>{
      this.funcionario = resposta
      console.log(this.funcionario)
    })
    this.cargoService.mostrarTodosCargos().subscribe(resposta =>{
      this.cargos = resposta
      console.log(this.cargos)
    })
  }


  editarFuncionario() {
    this.funcionarioService.editarFuncionario(this.funcionario, this.funcionario.id_funcionario, this.id_cargo).subscribe({
      next: () => {this.editado=true},
      error: () => {this.error=true},
      complete:() => setTimeout(() => {
          this.router.navigate([`funcionarioCargo/${this.id_cargo}`])
        }, 2000)
      })

    }

    transferirCargo(){
      this.funcionarioService.editarFuncionario(this.funcionario, this.funcionario.id_funcionario,this.id_cargo).subscribe({
        next: () => {this.transferido=true},
        error: () => {this.error=true},
        complete:() => setTimeout(() => {
          this.router.navigate([`funcionarioCargo/${this.id_cargo}`])
        }, 2000)

      })
      }

    cancelarAcao(){
      this.isModal=false
    }

    mostrarModal(){
      this.isModal = true
    }

    fechar(){
      this.transferido=false
      this.error=false
      this.erro=false
      this.editado=false
    }

   
}
