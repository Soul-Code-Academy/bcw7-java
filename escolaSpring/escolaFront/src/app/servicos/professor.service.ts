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

    buscarTodosProfessores():Observable<Professor[]>{
      const url = `${this.baseUrl}/professor-turma`
      return this.http.get<Professor[]>(url)
    }

    cadastrarProfessor(professor:Professor): Observable<Professor>{
      const url = `${this.baseUrl}/professor`
      return this.http.post<Professor>(url,professor)
    }

    buscarUmProfessor(id_professor:String):Observable<Professor>{
      const url = `${this.baseUrl}/professor/${id_professor}`
      return this.http.get<Professor>(url)
    }

    buscarProfessorComTurma(id_turma: string):Observable<Professor>{
      const url = `${this.baseUrl}/professor-turma/${id_turma}`
      return this.http.get<Professor>(url)
    }

    buscarProfessorSemTurma():Observable<Professor[]>{
      const url = `${this.baseUrl}/professor-sem-turma`
      return this.http.get<Professor[]>(url)
    }

    buscarProfessorPeloCpf(pro_cpf:String):Observable<Professor>{
      const url = `${this.baseUrl}/professor-cpf/${pro_cpf}`
      return this.http.get<Professor>(url)
    }

    // buscarProfessorPeloNome(pro_nome:String):Observable<Professor>{
    //   const url = `${this.baseUrl}/professor-nome/${pro_nome}`
    //   return this.http.get<Professor>(url)
    // }


    excluirProfessor(id_professor:String):Observable<void>{
      const url = `${this.baseUrl}/professor/${id_professor}`
      return this.http.delete<void>(url)
    }

    editarProfessor(professor:Professor):Observable<void>{
      const url = `${this.baseUrl}/professor/${professor.id_professor}`
      return this.http.put<void>(url,professor)
    }

}
