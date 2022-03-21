import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Boleto } from '../modelos/boleto.Moddelo';

@Injectable({
  providedIn: 'root'
})
export class BoletoService {

  baseUrl: string= 'http://localhost:8181/escola'

  constructor(private http:HttpClient) { }

  listarBoletosDoAluno(ra_aluno:string):Observable<Boleto[]>{
    const url = `${this.baseUrl}/aluno/boleto-aluno/${ra_aluno}`
    return this.http.get<Boleto[]>(url)
  }

  cadastrarBoleto(boleto:Boleto, ra_aluno:String):Observable<Boleto>{
    const url = `${this.baseUrl}/aluno/boleto/${ra_aluno}`
    return this.http.post<Boleto>(url,boleto)

  }

  pagarBoleto(boleto:Boleto, codigo:string):Observable<Boleto>{
    const url = `${this.baseUrl}/aluno/pagar-boleto/${codigo}`
    return this.http.put<Boleto>(url,boleto)
  }

  cancelarBoleto(boleto:Boleto, codigo:string):Observable<Boleto>{
    const url = `${this.baseUrl}/aluno/cancelar-boleto/${codigo}`
    return this.http.put<Boleto>(url,boleto)
  }

  editarBoleto(boleto:Boleto, codigo:string, ra_aluno:string):Observable<Boleto>{
    const url = `${this.baseUrl}/aluno/boleto/${codigo}/${ra_aluno}`
    return this.http.put<Boleto>(url,boleto)
  }

  buscarUmBoleto(codigo:string):Observable<Boleto>{
    const url = `${this.baseUrl}/aluno/boleto/${codigo}`
    return this.http.get<Boleto>(url)
  }
}
