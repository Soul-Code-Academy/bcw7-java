import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cargo } from '../models/cargoModelo';

@Injectable({
  providedIn: 'root'
})
export class CargoService {

  baseUrl: String = 'http://localhost:8080/empresa'

  constructor(private http:HttpClient) { }

  mostrarTodosCargos():Observable<Cargo[]>{
    const url = `${this.baseUrl}/listarCargos`
    return this.http.get<Cargo[]>(url)
  }

  cadastrarCargo(cargo:Cargo):Observable<Cargo>{
    const url = `${this.baseUrl}/listarCargos`
    return this.http.post<Cargo>(url,cargo)
  }

  mostrarUmCargo(id:string):Observable<Cargo>{
    const url = `${this.baseUrl}/listarCargos/${id}`
    return this.http.get<Cargo>(url)
  }

  excluirUmCargo(id:String):Observable<Cargo>{
    const url = `${this.baseUrl}/listarCargos/${id}`
    return this.http.delete<Cargo>(url)

  }

  editarCargo(cargo:Cargo):Observable<Cargo>{
    const url = `${this.baseUrl}/listarCargos/${cargo.id_cargo}`
    return this.http.put<Cargo>(url,cargo)
  }
}
