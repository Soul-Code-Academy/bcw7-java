import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Cargo } from 'src/app/models/cargoModelo';
import { CargoService } from 'src/app/services/cargo.service';

@Component({
  selector: 'app-excluir-cargo',
  templateUrl: './excluir-cargo.component.html',
  styleUrls: ['./excluir-cargo.component.css']
})
export class ExcluirCargoComponent implements OnInit {

  deletado = false;
  error = false;

  cargo: Cargo={
    id_cargo:'',
    ca_nome:'',
    ca_atribuicao:''
  }

  constructor(private cargoService:CargoService, private activatedRoute:ActivatedRoute, private router:Router) {
    this.cargo.id_cargo = this.activatedRoute.snapshot.paramMap.get('id')
   }

  ngOnInit() {
    this.mostrarUmCargo();
  }

  mostrarUmCargo(){
    this.cargoService.mostrarUmCargo(this.cargo.id_cargo).subscribe((resultado)=>{
      this.cargo= resultado
    })
  }


  excluirCargo() {
    this.cargoService.excluirUmCargo(this.cargo.id_cargo).subscribe({
      next: () => {this.deletado=true},
      error: () => {this.error=true},
      complete:() => setTimeout(() => {
        this.router.navigate(["/listarCargos"])
      }, 2000)

    })


    }

}
