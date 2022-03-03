import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import { HttpClientModule } from '@angular/common/http';
import { ListarCargosComponent } from './views/cargo/listar-cargos/listar-cargos.component';
import { EditarCargoComponent } from './views/cargo/editar-cargo/editar-cargo.component';
import { ExcluirCargoComponent } from './views/cargo/excluir-cargo/excluir-cargo.component';
import { CadastrarCargoComponent } from './views/cargo/cadastrar-cargo/cadastrar-cargo.component';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from './views/home/home.component';

import { EditarFuncionarioComponent } from './views/funcionario/editar-funcionario/editar-funcionario.component';
import { ExcluirFuuncionarioComponent } from './views/funcionario/excluir-fuuncionario/excluir-fuuncionario.component';
import { CadastrarFuncionarioComponent } from './views/funcionario/cadastrar-funcionario/cadastrar-funcionario.component';
import { GaleriaComponent } from './views/galeria/galeria.component';
import { ContatoComponent } from './views/contato/contato.component';
import { ListarTodosFuncionariosComponent } from './views/funcionario/listar-todos-funcionarios/listar-todos-funcionarios.component';
import { ListarFuncionariosCargoComponent } from './views/funcionario/listar-funcionarios-cargo/listar-funcionarios-cargo.component';
import { TelaLoginComponent } from './security/tela-login/tela-login.component';
import { FooterComponent } from './templates/footer/footer.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { NavbarComponent } from './templates/navbar/navbar.component';
import { DepartamentoCargoComponent } from './views/departamento/departamento-cargo/departamento-cargo.component';
import { ListarDepartamentoComponent } from './views/departamento/listar-departamento/listar-departamento.component';
import { CargoAoDepartamentoComponent } from './views/departamento/cargo-ao-departamento/cargo-ao-departamento.component';

@NgModule({
  declarations: [
    AppComponent,
    ListarCargosComponent,
    EditarCargoComponent,
    ExcluirCargoComponent,
    CadastrarCargoComponent,
    HomeComponent,
    NavbarComponent,
    ListarFuncionariosCargoComponent,
    EditarFuncionarioComponent,
    ExcluirFuuncionarioComponent,
    CadastrarFuncionarioComponent,
    GaleriaComponent,
    ContatoComponent,
    ListarTodosFuncionariosComponent,

    TelaLoginComponent,
     FooterComponent,
     DepartamentoCargoComponent,
     ListarDepartamentoComponent,
     CargoAoDepartamentoComponent,

  ],
  imports: [

    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule,



  ],

  providers: [

    ],
  bootstrap: [AppComponent]
})
export class AppModule { }
