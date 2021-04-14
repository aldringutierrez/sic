import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Encuesta } from 'src/app/modelo/Encuesta';
import { EncuestaServService } from '../../servicios/encuesta-serv.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-nuevo',
  templateUrl: './nuevo.component.html',
  styleUrls: ['./nuevo.component.css']
})
export class NuevoComponent implements OnInit {
  encuesta:Encuesta=new Encuesta();
  marcas:any[]=[{codigo:"1",nombre:"Intel"},{codigo:"2",nombre:"Amd"},{codigo:"3",nombre:"Apple"}]


  constructor(private router:Router,private encuestaServ:EncuestaServService) { }

  ngOnInit(): void {
  }
  guardar(encuesta:Encuesta){
    console.log("guardar : "+encuesta.email);
    this.encuestaServ.crear(encuesta)
    .subscribe(data=>{
      alert("Se agrego con exito.");
      this.router.navigate(["lista"])
    });
  }


}
