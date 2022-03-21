import { Location } from '@angular/common';
import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Boleto } from 'src/app/modelos/boleto.Moddelo';
import { BoletoService } from 'src/app/servicos/boleto.service';

@Component({
  selector: 'app-editar-boleto',
  templateUrl: './editar-boleto.component.html',
  styleUrls: ['./editar-boleto.component.css']
})
export class EditarBoletoComponent implements OnInit {

  codigo:any
  ra_aluno:any

  boleto:Boleto={
    codigo:'',
    bo_descricao:'',
    bo_dataVencimento:'',
    bo_valor:0,
    bo_status:''

  }
  constructor(private boletoService:BoletoService,
              private route:ActivatedRoute,
              private router:Router,
              private location:Location) {
                this.codigo = this.route.snapshot.paramMap.get("codigo")
                this.ra_aluno = this.route.snapshot.paramMap.get("ra_aluno")
              }

  ngOnInit(): void {
    this.boletoService.buscarUmBoleto(this.codigo).subscribe(resultado =>{
      this.boleto = resultado
     this.boleto.bo_dataVencimento = resultado.bo_dataVencimento.slice(0,10)
    })
  }

  editarBoleto(){
    this.boletoService.editarBoleto(this.boleto, this.codigo,this.ra_aluno).subscribe({
      complete: () => {alert("Boleto editado!")
                        this.location.back()},
      error: () => {alert("Erro ao editar.")
                        this.location.back()},
    })

  }
}
