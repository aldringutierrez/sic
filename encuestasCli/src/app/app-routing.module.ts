import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ListaComponent } from './components/lista/lista.component';
import { NuevoComponent  } from './components/nuevo/nuevo.component';

const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path: 'lista', component: ListaComponent},
  {path: 'nuevo', component: NuevoComponent},
  {path:'**',redirectTo:'home'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
