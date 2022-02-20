import { Cargo } from './../models/cargoModelo';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Funcionario } from '../models/funcionarioModelo';

@Injectable({
  providedIn: 'root'
})

export class FuncionarioService {

  baseUrl: string= 'http://localhost:8080/empresa'

  constructor(private http:HttpClient) { }

  buscarFuncionarioCargo(id_cargo: string):Observable<Funcionario[]>{
    const url = `${this.baseUrl}/funcionario/busca-cargo/${id_cargo}`
    return this.http.get<Funcionario[]>(url)
  }

  cadastrarFuncionario(funcionario:Funcionario, id_cargo:string):Observable<Funcionario>{
    const url = `${this.baseUrl}/funcionario?cargo=${id_cargo}`
    return this.http.post<Funcionario>(url,funcionario)
  }

  mostrarUmFuncionario(id_funcionario:string):Observable<Funcionario>{
    const url = `${this.baseUrl}/funcionario/${id_funcionario}`
    return this.http.get<Funcionario>(url)
  }

  excluirUmFuncionario(id_funcionario:string):Observable<Funcionario>{
    const url = `${this.baseUrl}/funcionario/${id_funcionario}`
    return this.http.delete<Funcionario>(url)

  }

  editarFuncionario(funcionario:Funcionario):Observable<void>{
    const url = `${this.baseUrl}/funcionarioCargo/:id_cargo/${funcionario.id_funcionario}`
    return this.http.put<void>(url,funcionario)
  }

}
