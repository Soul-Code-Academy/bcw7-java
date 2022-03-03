import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastrarCargoComponent } from './views/cargo/cadastrar-cargo/cadastrar-cargo.component';
import { CadastrarFuncionarioComponent } from './views/funcionario/cadastrar-funcionario/cadastrar-funcionario.component';
import { ContatoComponent } from './views/contato/contato.component';
import { EditarCargoComponent } from './views/cargo/editar-cargo/editar-cargo.component';
import { EditarFuncionarioComponent } from './views/funcionario/editar-funcionario/editar-funcionario.component';
import { ExcluirCargoComponent } from './views/cargo/excluir-cargo/excluir-cargo.component';
import { ExcluirFuuncionarioComponent } from './views/funcionario/excluir-fuuncionario/excluir-fuuncionario.component';
import { GaleriaComponent } from './views/galeria/galeria.component';
import { HomeComponent } from './views/home/home.component';
import { ListarCargosComponent } from './views/cargo/listar-cargos/listar-cargos.component';
import { ListarTodosFuncionariosComponent } from './views/funcionario/listar-todos-funcionarios/listar-todos-funcionarios.component';
import { ListarFuncionariosCargoComponent } from './views/funcionario/listar-funcionarios-cargo/listar-funcionarios-cargo.component';
import { TelaLoginComponent } from './security/tela-login/tela-login.component';
import { FooterComponent } from './templates/footer/footer.component';
import { ListarDepartamentoComponent } from './views/departamento/listar-departamento/listar-departamento.component';
import { DepartamentoCargoComponent } from './views/departamento/departamento-cargo/departamento-cargo.component';
import { CargoAoDepartamentoComponent } from './views/departamento/cargo-ao-departamento/cargo-ao-departamento.component';

const routes: Routes = [
    {path: "", redirectTo: "/home", pathMatch: 'full'},
    {path: "home", component:HomeComponent},
    {path: "listarCargos", component:ListarCargosComponent},
    {path: "cadastrarCargo", component:CadastrarCargoComponent},
    {path: "excluirCargo/:id", component:ExcluirCargoComponent},
    {path: "editarCargo/:id", component:EditarCargoComponent},
    {path: "cadastrarCargo/editarCargo/:id", component:EditarCargoComponent},
    {path: "funcionarioCargo/:id_cargo", component:ListarFuncionariosCargoComponent },
    {path: "cadastrarFuncionario/:id_cargo", component:CadastrarFuncionarioComponent},
    {path: "excluirFuncionario/:id_funcionario", component:ExcluirFuuncionarioComponent},
    {path: "editarFuncionario/:id_funcionario/:id_cargo", component:EditarFuncionarioComponent},
    {path: "galeria", component:GaleriaComponent},
    {path: "contato", component:ContatoComponent},
    {path: "listarFuncionariosGeral", component:ListarTodosFuncionariosComponent},
    {path: "login", component:TelaLoginComponent},
    {path: "footer", component:FooterComponent},
    {path: "departamento", component:ListarDepartamentoComponent},
    {path: "departamentoCargo/:id_cargo", component:DepartamentoCargoComponent},
    {path: "cargoDepartamento", component:CargoAoDepartamentoComponent},

  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
