import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componentes/header/header.component';
import { FooterComponent } from './componentes/footer/footer.component';
import { HomeComponent } from './componentes/home/home.component';
import { ListarTurmaComponent } from './componentes/listar-turma/listar-turma.component';
import { CadastrarTurmaComponent } from './componentes/cadastrar-turma/cadastrar-turma.component';
import { ExcluirTurmaComponent } from './componentes/excluir-turma/excluir-turma.component';
import { EditarTurmaComponent } from './componentes/editar-turma/editar-turma.component';
import { ListarAlunoComponent } from './componentes/listar-aluno/listar-aluno.component';
import { CadastrarAlunoComponent } from './componentes/cadastrar-aluno/cadastrar-aluno.component';
import { ExcluirAlunoComponent } from './componentes/excluir-aluno/excluir-aluno.component';
import { EditarAlunoComponent } from './componentes/editar-aluno/editar-aluno.component';
import { ListaGeralAlunosComponent } from './componentes/lista-geral-alunos/lista-geral-alunos.component';
import { ListarProfessorComponent } from './componentes/listar-professor/listar-professor.component';

import { Ng2SearchPipeModule } from 'ng2-search-filter';
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
