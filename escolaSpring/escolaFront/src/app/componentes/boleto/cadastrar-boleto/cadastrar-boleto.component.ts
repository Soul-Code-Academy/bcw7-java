import { ActivatedRoute, Router } from '@angular/router';
import { BoletoService } from './../../../servicos/boleto.service';
import { Component, OnInit } from '@angular/core';
import { Boleto } from 'src/app/modelos/boleto.Moddelo';
import { Location } from '@angular/common';

@Component({
  selector: 'app-cadastrar-boleto',
  templateUrl: './cadastrar-boleto.component.html',
  styleUrls: ['./cadastrar-boleto.component.css']
})
export class CadastrarBoletoComponent implements OnInit {

  ra_aluno:any

  boleto:Boleto ={
    codigo:'',
    bo_descricao:'',
    bo_dataVencimento:'',
    bo_status:'PENDENTE',
    bo_valor:0
  }

  constructor(private boletoService: BoletoService,
              private route:ActivatedRoute,
              private router: Router,
              private location:Location) {
                this.ra_aluno = this.route.snapshot.paramMap.get('ra_aluno')

               }

  ngOnInit(): void {
  }

  cadastrarBoleto(){
    this.boletoService.cadastrarBoleto(this.boleto, this.ra_aluno).subscribe({
      complete: () => {alert("Boleto cadastrado!")
                        this.location.back()},
      error: () => {alert("Erro ao cadastrar!")
      this.location.back()}
    })
  }

}
