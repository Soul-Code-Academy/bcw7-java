import { Professor } from './../modelos/professorModel';
import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Turma } from '../modelos/turmaModel';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class TurmaService {

  baseUrl: String = 'http://localhost:8181/escola'
  constructor(private http:HttpClient) { }

  mostrarTodasTurmas():Observable<Turma[]>{
    const url = `${this.baseUrl}/turma`
    return this.http.get<Turma[]>(url)
  }

  mostrarTurmasSemProfesor():Observable<Turma[]>{
    const url = `${this.baseUrl}/turma-sem-professor`
    return this.http.get<Turma[]>(url)
  }

  mostrarUmaTurma(id:string):Observable<Turma>{
    const url = `${this.baseUrl}/turma/${id}`
    return this.http.get<Turma>(url)
  }

  buscarTurmaDoProfessor(id_professor:String):Observable<Turma>{
    const url = `${this.baseUrl}/turma/turma-professor/${id_professor}`
    return this.http.get<Turma>(url)
  }

  buscarTodasTurmas():Observable<any>{
    const url = `${this.baseUrl}/turma/turma-professor`
    return this.http.get<any>(url)
  }

  cadastrarTurma(turma:Turma): Observable<Turma>{
    const url = `${this.baseUrl}/turma`
    return this.http.post<Turma>(url,turma)
  }

  excluirUmaTurma(id:String):Observable<void>{
    const url = `${this.baseUrl}/turma/${id}`
    return this.http.delete<void>(url)
  }

  editarTurma(turma:Turma):Observable<void>{
    const url = `${this.baseUrl}/turma/${turma.id_turma}`
    return this.http.put<void>(url,turma)
  }

  atribuirProfessor(turma:Turma,id_turma:String, id_professor:String):Observable<void>{
    const url = `${this.baseUrl}/turma/definir-professor/${id_turma}/${id_professor}`
    return this.http.put<void>(url,turma);

  }

  deixarTurmaSemProfessor(turma:Turma,id_turma:String, id_professor:String):Observable<void>{
    const url = `${this.baseUrl}/turma/tirar-professor/${id_turma}/${id_professor}`
    return this.http.put<void>(url,turma);

  }

}
