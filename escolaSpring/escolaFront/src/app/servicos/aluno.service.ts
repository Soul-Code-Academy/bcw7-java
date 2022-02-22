import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Aluno } from '../modelos/alunoModel';

@Injectable({
  providedIn: 'root'
})
export class AlunoService {
  buscarAlunos() {
    throw new Error('Method not implemented.');
  }

  baseUrl: string= 'http://localhost:8181/escola'

  constructor(private http:HttpClient) { }

  buscarAlunosTurma(id_turma: string):Observable<Aluno[]>{
    const url = `${this.baseUrl}/aluno/busca-turma/${id_turma}`
    return this.http.get<Aluno[]>(url)
  }

  buscarTodosAlunos():Observable<Aluno[]>{
    const url = `${this.baseUrl}/aluno`
    return this.http.get<Aluno[]>(url)
  }

  cadastrarAluno(aluno:Aluno, id_turma:string):Observable<Aluno>{
    const url = `${this.baseUrl}/aluno?turma=${id_turma}`
    return this.http.post<Aluno>(url,aluno)
  }

  mostrarUmAluno(ra_aluno:string):Observable<Aluno>{
    const url = `${this.baseUrl}/aluno/${ra_aluno}`
    return this.http.get<Aluno>(url)
  }

  excluirUmAluno(ra_aluno:string):Observable<Aluno>{
    const url = `${this.baseUrl}/aluno/${ra_aluno}`
    return this.http.delete<Aluno>(url)

  }

  editarAluno(aluno:Aluno, ra_aluno:string, id_turma:string):Observable<Aluno>{
    // http://localhost:8181/escola/aluno/1?turma=3
    const url = `${this.baseUrl}/aluno/${ra_aluno}?turma=${id_turma}`
    return this.http.put<Aluno>(url,aluno)
  }
}

