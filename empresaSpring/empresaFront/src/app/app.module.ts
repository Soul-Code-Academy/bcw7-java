import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import { HttpClientModule } from '@angular/common/http';
import { ListarCargosComponent } from './components/cargo/listar-cargos/listar-cargos.component';
import { EditarCargoComponent } from './components/cargo/editar-cargo/editar-cargo.component';
import { ExcluirCargoComponent } from './components/cargo/excluir-cargo/excluir-cargo.component';
import { CadastrarCargoComponent } from './components/cargo/cadastrar-cargo/cadastrar-cargo.component';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from './components/home/home.component';
import { SidebarComponent } from './components/templates/sidebar/sidebar.component';
import { EditarFuncionarioComponent } from './components/funcionario/editar-funcionario/editar-funcionario.component';
import { ExcluirFuuncionarioComponent } from './components/funcionario/excluir-fuuncionario/excluir-fuuncionario.component';
import { CadastrarFuncionarioComponent } from './components/cadastrar-funcionario/cadastrar-funcionario.component';
import { GaleriaComponent } from './components/galeria/galeria.component';
import { ContatoComponent } from './components/contato/contato.component';
import { ListarTodosFuncionariosComponent } from './components/funcionario/listar-todos-funcionarios/listar-todos-funcionarios.component';
import { ListarFuncionariosCargoComponent } from './components/funcionario/listar-funcionarios-cargo/listar-funcionarios-cargo.component';
import { TelaLoginComponent } from './components/security/tela-login/tela-login.component';
import { FooterComponent } from './components/templates/footer/footer.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';

@NgModule({
  declarations: [
    AppComponent,
    ListarCargosComponent,
    EditarCargoComponent,
    ExcluirCargoComponent,
    CadastrarCargoComponent,
    HomeComponent,
    SidebarComponent,
    ListarFuncionariosCargoComponent,
    EditarFuncionarioComponent,
    ExcluirFuuncionarioComponent,
    CadastrarFuncionarioComponent,
    GaleriaComponent,
    ContatoComponent,
    ListarTodosFuncionariosComponent,

    TelaLoginComponent,
     FooterComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule

  ],
  providers: [
    ],
  bootstrap: [AppComponent]
})
export class AppModule { }
