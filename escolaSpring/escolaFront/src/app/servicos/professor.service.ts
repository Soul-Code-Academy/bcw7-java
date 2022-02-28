import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Professor } from '../modelos/professorModel';

@Injectable({
  providedIn: 'root'
})
export class ProfessorService {

  baseUrl: string= 'http://localhost:8181/escola'

  constructor(private http:HttpClient) { }

  buscarProfessorComTurma(id_turma: string):Observable<Professor>{
    const url = `${this.baseUrl}/professor-turma/${id_turma}`
    return this.http.get<Professor>(url)
  }

  buscarProfessorSemTurma():Observable<Professor[]>{
    const url = `${this.baseUrl}/professor-sem-turma`
    return this.http.get<Professor[]>(url)
  }


  buscarTodosProfessores():Observable<Professor[]>{
    const url = `${this.baseUrl}/professor-turma`
    return this.http.get<Professor[]>(url)
  }


}
