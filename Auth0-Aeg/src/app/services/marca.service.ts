import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Marca} from '../modelo/Marca';

@Injectable({
  providedIn: 'root'
})
export class MarcaService {

  marca:Marca;
  marcas:Marca[];
 
  url="http://localhost:8003";
  constructor(private http:HttpClient) { 
  }

  getTodos(){
    return this.http.get<Marca[]>(this.url+"/listar");
  }
  
  getUno(id:number){
    console.log(this.url+"/ver/"+id);
    return this.http.get<Marca>(this.url+"/ver/"+id);
  }
  
  crear(marca:Marca){
    console.log("p2service  - crear");
    return this.http.post<Marca[]>(this.url+"/nuevo",marca);
  }
  
  modificar(marca:Marca){
    return this.http.put<Marca[]>(this.url+"/modificar",marca);
  }
  
  borrar(marca:Marca){
    console.log(this.url+"/borrar"+"/"+marca.idmarca);
    return this.http.delete(this.url+"/borrar"+"/"+marca.idmarca);
  }
}


