import { NgModule, LOCALE_ID, DEFAULT_CURRENCY_CODE  } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import localePt from '@angular/common/locales/pt';
import { NgxCurrencyModule } from "ngx-currency";
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './templates/header/header.component';
import { FooterComponent } from './templates/footer/footer.component';
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

import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { ListarBoletoAlunoComponent } from './componentes/boleto/listar-boleto-aluno/listar-boleto-aluno.component';
import { registerLocaleData } from '@angular/common';
import { CadastrarBoletoComponent } from './componentes/boleto/cadastrar-boleto/cadastrar-boleto.component';
import { EditarBoletoComponent } from './componentes/boleto/editar-boleto/editar-boleto.component';
import { ListarBoletoComponent } from './componentes/boleto/listar-boleto/listar-boleto.component';


registerLocaleData(localePt)
@NgModule({
  declarations: [

    HeaderComponent,
    FooterComponent,
    LoginComponent,
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
    CadastrarDadosProfessorComponent,
    ExcluirProfessorComponent,
    EditarProfessorComponent,
    ListarBoletoAlunoComponent,
    CadastrarBoletoComponent,
    EditarBoletoComponent,
    ListarBoletoComponent,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    Ng2SearchPipeModule,
    NgxCurrencyModule,
    ReactiveFormsModule
  ],
  providers: [
    {provide:LOCALE_ID, useValue:'pt-BR'},
    {provide:DEFAULT_CURRENCY_CODE, useValue:'BRL'},
],
  bootstrap: [AppComponent]
})
export class AppModule { }
