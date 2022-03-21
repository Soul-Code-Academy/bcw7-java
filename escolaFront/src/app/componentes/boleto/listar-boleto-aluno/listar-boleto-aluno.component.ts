import { AlunoService } from './../../../servicos/aluno.service';
import { ActivatedRoute, Router } from '@angular/router';
import { BoletoService } from './../../../servicos/boleto.service';
import { Component, OnInit } from '@angular/core';
import { Boleto } from 'src/app/modelos/boleto.Moddelo';

@Component({
  selector: 'app-listar-boleto-aluno',
  templateUrl: './listar-boleto-aluno.component.html',
  styleUrls: ['./listar-boleto-aluno.component.css']
})
export class ListarBoletoAlunoComponent implements OnInit {

  ra_aluno:any

  nome_aluno:any
  search:any

  boletos:Boleto[]=[]

  constructor(private boletoService:BoletoService,
              private alunoService:AlunoService,
              private route:ActivatedRoute,
              private router:Router) {
                this.ra_aluno = this.route.snapshot.paramMap.get('ra_aluno')
               }

  ngOnInit(): void {
    this.listarBoletos()

    this.alunoService.mostrarUmAluno(this.ra_aluno).subscribe(resultado =>{
      this.nome_aluno = resultado.al_nome
      console.log(resultado.al_nome)
    })
}

  listarBoletos(){
    this.boletoService.listarBoletosDoAluno(this.ra_aluno).subscribe(resultado=>{
      this.boletos = resultado
    })
  }

  quitarBoleto(boleto:Boleto, codigo:any){
    this.boletoService.pagarBoleto(boleto,codigo).subscribe({
      complete: () => {alert("Boleto quitado!")
                          this.listarBoletos()},
      error: () => {alert("Erro! Boleto não quitado.")
                          this.listarBoletos()},
    })
  }

 cancelarBoleto(boleto:Boleto, codigo:any){
    this.boletoService.cancelarBoleto(boleto,codigo).subscribe({
      complete: () => {alert("Boleto cancelado!")
                          this.listarBoletos()},
      error: () => {alert("Erro! Boleto não cancelado.")
                          this.listarBoletos()},
    })
  }



  resetSearch() {
    this.search = '';
  }


}
