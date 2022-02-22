import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastrarCargoComponent } from './components/cadastrar-cargo/cadastrar-cargo.component';
import { CadastrarFuncionarioComponent } from './components/cadastrar-funcionario/cadastrar-funcionario.component';
import { ContatoComponent } from './components/contato/contato.component';
import { EditarCargoComponent } from './components/editar-cargo/editar-cargo.component';
import { EditarFuncionarioComponent } from './components/editar-funcionario/editar-funcionario.component';
import { ExcluirCargoComponent } from './components/excluir-cargo/excluir-cargo.component';
import { ExcluirFuuncionarioComponent } from './components/excluir-fuuncionario/excluir-fuuncionario.component';
import { GaleriaComponent } from './components/galeria/galeria.component';
import { HomeComponent } from './components/home/home.component';
import { ListarCargosComponent } from './components/listar-cargos/listar-cargos.component';
import { ListarTodosFuncionariosComponent } from './components/listar-todos-funcionarios/listar-todos-funcionarios.component';
import { ListarFuncionariosCargoComponent } from './components/listar-funcionarios-cargo/listar-funcionarios-cargo.component';
import { TelaLoginComponent } from './components/tela-login/tela-login.component';



const routes: Routes = [
    {path: "", redirectTo: "/home", pathMatch: 'full'},
    {path: "home", component:HomeComponent},
    {path: "listarCargos", component:ListarCargosComponent},
    {path: "cadastrarCargo", component:CadastrarCargoComponent},
    {path: "excluirCargo/:id", component:ExcluirCargoComponent},
    {path: "editarCargo/:id", component:EditarCargoComponent},
    {path:"cadastrarCargo/editarCargo/:id", component:EditarCargoComponent},
    {path: "funcionarioCargo/:id_cargo", component:ListarFuncionariosCargoComponent },
    {path: "cadastrarFuncionario/:id_cargo", component:CadastrarFuncionarioComponent},
    {path: "excluirFuncionario/:id_funcionario", component:ExcluirFuuncionarioComponent},
    {path:"editarFuncionario/:id_funcionario/:id_cargo", component:EditarFuncionarioComponent},
    {path:"galeria", component:GaleriaComponent},
    {path:"contato", component:ContatoComponent},
    {path: "listarFuncionariosGeral", component:ListarTodosFuncionariosComponent},
    {path: "login", component:TelaLoginComponent},

  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
