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

  buscarProfessorTurma(id_turma: string):Observable<Professor[]>{
    const url = `${this.baseUrl}/professor-turma/${id_turma}`
    return this.http.get<Professor[]>(url)
  }

  // buscarTodosAlunos():Observable<Professor[]>{
  //   const url = `${this.baseUrl}/professor`
  //   return this.http.get<Professor[]>(url)
  // }

  // cadastrarAluno(aluno:Aluno, id_turma:string):Observable<Aluno>{
  //   const url = `${this.baseUrl}/aluno?turma=${id_turma}`
  //   return this.http.post<Aluno>(url,aluno)
  // }

  mostrarUmProfessor(id_professor:string):Observable<Professor>{
    const url = `${this.baseUrl}/professor/${id_professor}`
    return this.http.get<Professor>(url)
  }

  // excluirUmAluno(ra_aluno:string):Observable<Aluno>{
  //   const url = `${this.baseUrl}/aluno/${ra_aluno}`
  //   return this.http.delete<Aluno>(url)

  // }

  // editarAluno(aluno:Aluno, ra_aluno:string, id_turma:string):Observable<Aluno>{
  //   // http://localhost:8181/escola/aluno/1?turma=3
  //   const url = `${this.baseUrl}/aluno/${ra_aluno}?turma=${id_turma}`
  //   return this.http.put<Aluno>(url,aluno)
  // }
}
