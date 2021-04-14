import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Encuesta} from '../modelo/Encuesta';

@Injectable({
  providedIn: 'root'
})
export class EncuestaServService {

  encuesta:Encuesta;
  url="http://localhost:8002";
  constructor(private http:HttpClient) { 
  }

  getTodos(){
    return this.http.get<Encuesta[]>(this.url+"/listar");
  }
  
  getUno(id:number){
    console.log(this.url+"/ver/"+id);
    return this.http.get<Encuesta>(this.url+"/ver/"+id);
  }
  
  crear(Encuesta:Encuesta){
    console.log("p2service  - crear");
    return this.http.post<Encuesta[]>(this.url+"/nuevo",Encuesta);
  }
  
  modificar(Encuesta:Encuesta){
    return this.http.put<Encuesta[]>(this.url+"/modificar",Encuesta);
  }
  
  borrar(Encuesta:Encuesta){
    console.log(this.url+"/borrar"+"/"+Encuesta.idEncuesta);
    return this.http.delete(this.url+"/borrar"+"/"+Encuesta.idEncuesta);
  }
}
