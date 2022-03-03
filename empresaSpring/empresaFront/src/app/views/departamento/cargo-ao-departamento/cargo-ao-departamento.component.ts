import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Cargo } from 'src/app/models/cargoModelo';
import { Departamento } from 'src/app/models/departamentoModelo';
import { CargoService } from 'src/app/services/cargo.service';
import { DepartamentoService } from 'src/app/services/departamento.service';

@Component({
  selector: 'app-cargo-ao-departamento',
  templateUrl: './cargo-ao-departamento.component.html',
  styleUrls: ['./cargo-ao-departamento.component.css']
})
export class CargoAoDepartamentoComponent implements OnInit {

  cadastrado = false;
  error = false;

  retirado = false;
  erro = false;

  id_departamento: any

  id_cargo: any
  departamentoCadastrado: boolean = false

  departamentosSemCargo:any
  departamentoSemCargo:any=[]

  departamento:Departamento ={
      id_departamento: '',
      dep_nome: '',
  }

 cargo:Cargo={
    id_cargo:'',
    ca_nome:'',
    ca_atribuicao:''
   }

   constructor(private departamentoService:DepartamentoService,
                private route:ActivatedRoute,
                private router:Router,
                private cargoService:CargoService) {
        this.id_cargo = this.route.snapshot.paramMap.get('id_cargo')! }


  ngOnInit(): void {
    this.buscarDepartamentoComCargo()

    this.departamentoService.buscarDepartamentoSemCargo().subscribe((resultado)=>{
      this.departamentosSemCargo = resultado
    })

    this.cargoService.mostrarUmCargo(this.id_cargo).subscribe(resultado =>{
      this.cargo = resultado
    })
  }

  buscarDepartamentoComCargo(){
    this.departamentoService.buscarDepartamentoDoCargo(this.id_cargo).subscribe((resultado:any)=>{
      if(resultado == undefined){
        this.departamentoCadastrado=false
      }else{
        this.departamentoCadastrado=true
        this.departamento = resultado;
      }
    })
  }

  mostrarDepartamento(){
    this.departamento = this.departamentoSemCargo
  }

  atribuirCargoDepartamento(){
    this.departamentoService.buscarUmDepartamento(this.id_departamento).subscribe((resultado)=>{
      this.departamento = resultado
    })
    this.cargoService.atribuirDepartamento(this.cargo, this.id_cargo, this.departamento.id_departamento).subscribe({
      next: () => {this.cadastrado=true
        setTimeout(() => {
          this.router.navigate(['/departamento'])
  }, 2000)},
      error: () => {this.error=true
        setTimeout(() => {
          this.router.navigate(['/departamento'])
  }, 2000)},
      complete:() => setTimeout(() => {
                this.router.navigate(['/departamento'])
        }, 2000)

      })
  }

  deixarCargoSemDepartamento(){
    this.cargoService.deixarCargoSemDepartamento(this.cargo, this.id_cargo,this.departamento.id_departamento).subscribe({
      next: () => {this.retirado=true},
      error: () => {this.erro=true},
      complete:() => setTimeout(() => {
                this.router.navigate(['/listarCargos'])
        }, 2000)
    })
  }
}
