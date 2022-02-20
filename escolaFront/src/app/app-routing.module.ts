import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './componentes/home/home.component';
import { ListarTurmaComponent } from './componentes/listar-turma/listar-turma.component';
import { CadastrarTurmaComponent } from './componentes/cadastrar-turma/cadastrar-turma.component';
import { ExcluirTurmaComponent } from './componentes/excluir-turma/excluir-turma.component';
import { EditarTurmaComponent } from './componentes/editar-turma/editar-turma.component';
import { ListarAlunoComponent } from './componentes/listar-aluno/listar-aluno.component';
import { CadastrarAlunoComponent } from './componentes/cadastrar-aluno/cadastrar-aluno.component';
import { ExcluirAlunoComponent } from './componentes/excluir-aluno/excluir-aluno.component';
import { EditarAlunoComponent } from './componentes/editar-aluno/editar-aluno.component';

const routes: Routes = [
  {path: "", redirectTo: "/home", pathMatch: 'full'},
  {path: "home", component:HomeComponent},
  {path: "turma", component:ListarTurmaComponent},
  {path: "cadastrarTurma", component:CadastrarTurmaComponent},
  {path: "excluirTurma/:id", component:ExcluirTurmaComponent},
  {path:"turma/editarTurma/:id", component:EditarTurmaComponent},
  {path: "alunoTurma/:id_turma", component:ListarAlunoComponent},
  {path: "cadastrarAluno/:id_turma", component:CadastrarAlunoComponent},
  {path: "excluirAluno/:ra_aluno", component:ExcluirAlunoComponent},
  {path:"editarAluno/:ra_aluno", component:EditarAlunoComponent},

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
