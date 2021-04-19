import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ProtegidaComponent } from './components/protegida/protegida.component';
import { PreciosComponent } from './components/precios/precios.component';
import { HomeComponent } from './components/home/home.component';
import { AuthModule } from '@auth0/auth0-angular';
import { AuthButtonComponent } from './components/auth-button-component/auth-button-component.component';
import { UserProfileComponent } from './components/user-profile-component/user-profile-component.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ListaComponent } from './components/lista/lista.component';
import { NuevoComponent } from './components/nuevo/nuevo.component';
import { MarcasPipe } from './pipes/marcas.pipe';



@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ProtegidaComponent,
    PreciosComponent,
    HomeComponent,
    AuthButtonComponent,
    ListaComponent,
    NuevoComponent,
    MarcasPipe,
    UserProfileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    AuthModule.forRoot({
      domain: 'dev-ky5rlz4p.us.auth0.com',
      clientId: 'GIRNYwGOKZwWATiZTeUntmGDWZBFiJhQ'
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
