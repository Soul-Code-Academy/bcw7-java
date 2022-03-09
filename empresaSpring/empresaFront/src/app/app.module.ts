import { NgModule ,  LOCALE_ID, DEFAULT_CURRENCY_CODE } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgxCurrencyModule } from "ngx-currency";

import localePt from '@angular/common/locales/pt';
import { CurrencyPipe, registerLocaleData } from '@angular/common';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import { HttpClientModule } from '@angular/common/http';
import { ListarCargosComponent } from './views/cargo/listar-cargos/listar-cargos.component';
import { EditarCargoComponent } from './views/cargo/editar-cargo/editar-cargo.component';
import { CadastrarCargoComponent } from './views/cargo/cadastrar-cargo/cadastrar-cargo.component';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from './views/home/home.component';

import { EditarFuncionarioComponent } from './views/funcionario/editar-funcionario/editar-funcionario.component';
import { CadastrarFuncionarioComponent } from './views/funcionario/cadastrar-funcionario/cadastrar-funcionario.component';
import { GaleriaComponent } from './views/galeria/galeria.component';
import { ContatoComponent } from './views/contato/contato.component';
import { ListarTodosFuncionariosComponent } from './views/funcionario/listar-todos-funcionarios/listar-todos-funcionarios.component';
import { ListarFuncionariosCargoComponent } from './views/funcionario/listar-funcionarios-cargo/listar-funcionarios-cargo.component';
import { TelaLoginComponent } from './security/tela-login/tela-login.component';
import { FooterComponent } from './templates/footer/footer.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { NavbarComponent } from './templates/navbar/navbar.component';
import { DepartamentoCargoComponent } from './views/departamento/inserir-departamento-cargo/departamento-cargo.component';
import { ListarDepartamentoComponent } from './views/departamento/listar-departamento/listar-departamento.component';
import { CadastrarDadosDepartamentoComponent } from './views/departamento/cadastrar-dados-departamento/cadastrar-dados-departamento.component';
import { EditarDadosDepartamentoComponent } from './views/departamento/editar-dados-departamento/editar-dados-departamento.component';
import { ListarContraChequeFuncionarioComponent } from './views/contraCheque/listar-contra-cheque-funcionario/listar-contra-cheque-funcionario.component';
import { CadastrarContraChequeComponent } from './views/contraCheque/cadastrar-contra-cheque/cadastrar-contra-cheque.component';
import { EditarContraChequeComponent } from './views/contraCheque/editar-contra-cheque/editar-contra-cheque.component';

registerLocaleData(localePt)


@NgModule({
  declarations: [
    AppComponent,
    ListarCargosComponent,
    EditarCargoComponent,
    CadastrarCargoComponent,
    HomeComponent,
    NavbarComponent,
    ListarFuncionariosCargoComponent,
    EditarFuncionarioComponent,

    CadastrarFuncionarioComponent,
    GaleriaComponent,
    ContatoComponent,
    ListarTodosFuncionariosComponent,

    TelaLoginComponent,
     FooterComponent,
     DepartamentoCargoComponent,
     ListarDepartamentoComponent,
     CadastrarDadosDepartamentoComponent,
     EditarDadosDepartamentoComponent,
     ListarContraChequeFuncionarioComponent,
     CadastrarContraChequeComponent,
     EditarContraChequeComponent,

  ],
  imports: [

    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule,
    NgxCurrencyModule



  ],

  providers: [
    { provide: LOCALE_ID, useValue: 'pt_BR' },
  { provide: DEFAULT_CURRENCY_CODE, useValue: 'BRL' },
    CurrencyPipe
    ],
  bootstrap: [AppComponent]
})
export class AppModule { }
