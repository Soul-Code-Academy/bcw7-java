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

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
