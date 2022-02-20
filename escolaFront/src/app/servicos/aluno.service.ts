import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Aluno } from '../modelos/alunoModel';

@Injectable({
  providedIn: 'root'
})
export class AlunoService {

  baseUrl: string= 'http://localhost:8080/escola'

  constructor(private http:HttpClient) { }

  buscarAlunosTurma(id_turma: string):Observable<Aluno[]>{
    const url = `${this.baseUrl}/aluno/busca-turma/${id_turma}`
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

  editarAluno(aluno:Aluno):Observable<void>{
    const url = `${this.baseUrl}/alunoTurma/:id_turma/${aluno.ra_aluno}`
    return this.http.put<void>(url,aluno)
  }
}

