import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './templates/header/header.component';
import { FooterComponent } from './templates/footer/footer.component';
import { HomeComponent } from './seguranca/login/home.component';
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

import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { CadastrarProfessorTurmaComponent } from './componentes/professor/cadastrar-professor-turma/cadastrar-professor-turma.component';
@NgModule({
  declarations: [

    HeaderComponent,
    FooterComponent,
    HomeComponent,
    ListarTurmaComponent,
    CadastrarTurmaComponent,
    ExcluirTurmaComponent,
    EditarTurmaComponent,
    AppComponent,
    ListarAlunoComponent,
    CadastrarAlunoComponent,
    ExcluirAlunoComponent,
    EditarAlunoComponent,
    ListaGeralAlunosComponent,
    ListarProfessorComponent,
    CadastrarProfessorTurmaComponent,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    Ng2SearchPipeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
