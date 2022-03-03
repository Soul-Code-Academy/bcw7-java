import { Funcionario } from '../../../models/funcionarioModelo';
import { Component, OnInit } from '@angular/core';
import { FuncionarioService } from 'src/app/services/funcionario.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-listar-funcionarios-cargo',
  templateUrl: './listar-funcionarios-cargo.component.html',
  styleUrls: ['./listar-funcionarios-cargo.component.css']
})
export class ListarFuncionariosCargoComponent implements OnInit {

  search:any
  id_cargo: string = ''
  funcionarios:Funcionario[] = []

  constructor(private funcionarioService:FuncionarioService, private route:ActivatedRoute, private router:Router) {
      this.id_cargo = this.route.snapshot.paramMap.get('id_cargo')!
    }

  ngOnInit(): void {
    this.buscarFuncionarioCargo();
  }

  buscarFuncionarioCargo(){
    this.funcionarioService.buscarFuncionarioCargo(this.id_cargo).subscribe((resultado)=>{
      this.funcionarios = resultado;

    })
  }

  resetSearch() {
    this.search = '';

    }


}
