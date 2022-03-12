import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RotaPublicaComponent } from './views/rota-publica/rota-publica.component';
import { RotaPrivadaComponent } from './views/rota-privada/rota-privada.component';
import { LoginComponent } from './views/login/login.component';
import { HeaderComponent } from './views/header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    RotaPublicaComponent,
    RotaPrivadaComponent,
    LoginComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
