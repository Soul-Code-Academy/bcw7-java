import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastrarCargoComponent } from './components/cadastrar-cargo/cadastrar-cargo.component';
import { CadastrarFuncionarioComponent } from './components/cadastrar-funcionario/cadastrar-funcionario.component';
import { EditarCargoComponent } from './components/editar-cargo/editar-cargo.component';
import { EditarFuncionarioComponent } from './components/editar-funcionario/editar-funcionario.component';
import { ExcluirCargoComponent } from './components/excluir-cargo/excluir-cargo.component';
import { ExcluirFuuncionarioComponent } from './components/excluir-fuuncionario/excluir-fuuncionario.component';
import { HomeComponent } from './components/home/home.component';
import { ListarCargosComponent } from './components/listar-cargos/listar-cargos.component';
import { ListarFuncionariosComponent } from './components/listar-funcionarios/listar-funcionarios.component';


const routes: Routes = [
    {path: "", redirectTo: "/home", pathMatch: 'full'},
    {path: "home", component:HomeComponent},
    {path: "listarCargos", component:ListarCargosComponent},
    {path: "cadastrarCargo", component:CadastrarCargoComponent},
    {path: "excluirCargo/:id", component:ExcluirCargoComponent},
    {path:"cadastrarCargo/editarCargo/:id", component:EditarCargoComponent},
    {path: "funcionarioCargo/:id_cargo", component:ListarFuncionariosComponent},
    {path: "cadastrarFuncionario/:id_cargo", component:CadastrarFuncionarioComponent},
    {path: "excluirFuncionario/:id_funcionario", component:ExcluirFuuncionarioComponent},
    {path:"editarFuncionario/:id_funcionario", component:EditarFuncionarioComponent},
  ];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
