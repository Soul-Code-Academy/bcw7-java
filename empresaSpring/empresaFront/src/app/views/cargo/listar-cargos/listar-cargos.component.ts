import { Component, OnInit } from '@angular/core';
import { Cargo } from 'src/app/models/cargoModelo';
import { CargoService } from 'src/app/services/cargo.service';

@Component({
  selector: 'app-listar-cargos',
  templateUrl: './listar-cargos.component.html',
  styleUrls: ['./listar-cargos.component.css']
})
export class ListarCargosComponent implements OnInit {

  cargos: Cargo [] = []
  search:any
  constructor(private cargoService: CargoService) { }

  ngOnInit() {
    this.mostrarTodosCargos();

  }

   mostrarTodosCargos(){
    this.cargoService.mostrarTodosCargos().subscribe(resposta =>{
      this.cargos = resposta
      console.log(this.cargos)
    })
  }

  resetSearch() {
    this.search = '';

    }


}
