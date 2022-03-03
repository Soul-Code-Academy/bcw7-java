import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './seguranca/login/login.component';
import { ListarTurmaComponent } from './componentes/turma/listar-turma/listar-turma.component';
import { CadastrarTurmaComponent } from './componentes/turma/cadastrar-turma/cadastrar-turma.component';
import { ExcluirTurmaComponent } from './componentes/turma/excluir-turma/excluir-turma.component';
import { EditarTurmaComponent } from './componentes/turma/editar-turma/editar-turma.component';
import { ListarAlunoComponent } from './componentes/aluno/listar-aluno/listar-aluno.component';
import { CadastrarAlunoComponent } from './componentes/aluno/cadastrar-aluno/cadastrar-aluno.component';
import { ExcluirAlunoComponent } from './componentes/aluno/excluir-aluno/excluir-aluno.component';
import { EditarAlunoComponent } from './componentes/aluno/editar-aluno/editar-aluno.component';
import { ListaGeralAlunosComponent } from './componentes/aluno/lista-geral-alunos/lista-geral-alunos.component';
import { ListarProfessorComponent } from './componentes/professor/listar-professor/listar-professor.component';
import { CadastrarProfessorTurmaComponent } from './componentes/professor/cadastrar-professor-turma/cadastrar-professor-turma.component';
import { CadastrarDadosProfessorComponent } from './componentes/professor/cadastrar-dados-professor/cadastrar-dados-professor.component';
import { ExcluirProfessorComponent } from './componentes/professor/excluir-professor/excluir-professor.component';
import { EditarProfessorComponent } from './componentes/professor/editar-professor/editar-professor.component';

const routes: Routes = [
  {path: "", redirectTo: "/home", pathMatch: 'full'},
  {path: "home", component:LoginComponent},
  {path: "turma", component:ListarTurmaComponent},
  {path: "cadastrarTurma", component:CadastrarTurmaComponent},
  {path: "excluirTurma/:id", component:ExcluirTurmaComponent},
  {path: "turma/editarTurma/:id", component:EditarTurmaComponent},
  {path: "alunoTurma/:id_turma", component:ListarAlunoComponent},
  {path: "cadastrarAluno/:id_turma", component:CadastrarAlunoComponent},
  {path: "excluirAluno/:ra_aluno/:id_turma", component:ExcluirAlunoComponent},
  {path: "editarAluno/:ra_aluno/:id_turma", component:EditarAlunoComponent},
  {path: "listaGeralAlunos", component:ListaGeralAlunosComponent},
  {path: "professor", component:ListarProfessorComponent},
  {path: "professorTurma/:id_turma", component:CadastrarProfessorTurmaComponent},
  {path: "cadastrarProfessor", component:CadastrarDadosProfessorComponent},
  {path: "excluirProfessor", component:ExcluirProfessorComponent},
  {path: "editarProfessor", component:EditarProfessorComponent},

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
