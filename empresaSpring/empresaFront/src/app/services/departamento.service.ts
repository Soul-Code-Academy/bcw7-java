import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Departamento } from '../models/departamentoModelo';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DepartamentoService {

  baseUrl: String = 'http://localhost:8080/empresa'

  constructor(private http:HttpClient) { }

  buscarUmDepartamento(id_departamento:String):Observable<Departamento>{
    const url = `${this.baseUrl}/departamento/${id_departamento}`
    return this.http.get<Departamento>(url)
  }

  buscarDepartamentoDoCargo(id_cargo:String):Observable<Departamento>{
    const url = `${this.baseUrl}/departamento-cargo/${id_cargo}`
    return this.http.get<Departamento>(url)
  }

  buscarDepartamentoSemCargo():Observable<Departamento[]>{
    const url = `${this.baseUrl}/departamento-sem-cargo`
    return this.http.get<Departamento[]>(url)
  }

  buscarTodosDepartamentos():Observable<any>{
    const url = `${this.baseUrl}/departamento/departamento-cargo`
    return this.http.get<any>(url)
  }
}





