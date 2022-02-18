import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Turma } from '../modelos/turmaModel';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class TurmaService {

  baseUrl: String = 'http://localhost:8080/escola'
  constructor(private http:HttpClient) { }

  mostrarTodasTurmas():Observable<Turma[]>{
    const url = `${this.baseUrl}/turma`
    return this.http.get<Turma[]>(url)
  }

  cadastrarTurma(turma:Turma):Observable<Turma>{
    const url = `${this.baseUrl}/turma`
    return this.http.post<Turma>(url,turma)
  }

  mostrarUmaTurma(id:string):Observable<Turma>{
    const url = `${this.baseUrl}/turma/${id}`
    return this.http.get<Turma>(url)
  }

  excluirUmaTurma(id_turma:string): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id_turma}`, { responseType: 'text' });
  }
}
