import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Cargo } from 'src/app/models/cargoModelo';
import { CargoService } from 'src/app/services/cargo.service';

@Component({
  selector: 'app-cadastrar-cargo',
  templateUrl: './cadastrar-cargo.component.html',
  styleUrls: ['./cadastrar-cargo.component.css']
})
export class CadastrarCargoComponent implements OnInit {

  cadastrado = false;
  error = false;

  cargo:Cargo = {
    ca_nome: '',
    ca_atribuicao: ''
  }

  constructor(private cargoService:CargoService, private router:Router) { }

  ngOnInit(): void {}

  cadastrarCargo(){
    this.cargoService.cadastrarCargo(this.cargo).subscribe({
      next: () => {this.cadastrado=true},
      error: () => {this.error=true},
      complete:() => setTimeout(() => {
              this.router.navigate(['/listarCargos'])
        }, 2000)
      })
     }

     fechar(){
       this.cadastrado=false
       this.error=false
     }
  }


