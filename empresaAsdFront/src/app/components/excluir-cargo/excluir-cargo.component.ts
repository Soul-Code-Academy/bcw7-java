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
      complete: () => alert('Cargo excluído com sucesso!'),
      error: () => alert('Este cargo possui alunos associados e não pode ser excluído!'),
    });
    this.router.navigate(['/listarCargos']);

    }

}
