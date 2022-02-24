import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import { HttpClientModule } from '@angular/common/http';
import { ListarCargosComponent } from './components/listar-cargos/listar-cargos.component';
import { EditarCargoComponent } from './components/editar-cargo/editar-cargo.component';
import { ExcluirCargoComponent } from './components/excluir-cargo/excluir-cargo.component';
import { CadastrarCargoComponent } from './components/cadastrar-cargo/cadastrar-cargo.component';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from './components/home/home.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { EditarFuncionarioComponent } from './components/editar-funcionario/editar-funcionario.component';
import { ExcluirFuuncionarioComponent } from './components/excluir-fuuncionario/excluir-fuuncionario.component';
import { CadastrarFuncionarioComponent } from './components/cadastrar-funcionario/cadastrar-funcionario.component';
import { GaleriaComponent } from './components/galeria/galeria.component';
import { ContatoComponent } from './components/contato/contato.component';
import { ListarTodosFuncionariosComponent } from './components/listar-todos-funcionarios/listar-todos-funcionarios.component';
import { ListarFuncionariosCargoComponent } from './components/listar-funcionarios-cargo/listar-funcionarios-cargo.component';
import { TelaLoginComponent } from './components/tela-login/tela-login.component';


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

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    CommonModule,
    FormsModule,
    ReactiveFormsModule,

  ],
  providers: [
    ],
  bootstrap: [AppComponent]
})
export class AppModule { }
