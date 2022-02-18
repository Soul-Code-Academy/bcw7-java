import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './componentes/home/home.component';
import { ListarTurmaComponent } from './componentes/listar-turma/listar-turma.component';
import { CadstrarTurmaComponent } from './componentes/cadstrar-turma/cadstrar-turma.component';
import { ExcluirTurmaComponent } from './componentes/excluir-turma/excluir-turma.component';
const routes: Routes = [
  {path: "home", component:HomeComponent},
  {path: "turma", component:ListarTurmaComponent},
  {path: "cadastrarTurma", component:CadstrarTurmaComponent},
  {path: "excluirTurma/:id", component:ExcluirTurmaComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
