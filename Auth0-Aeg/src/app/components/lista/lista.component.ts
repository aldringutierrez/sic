import {Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {Encuesta} from '../../modelo/Encuesta';
import {EncuestaServService} from '../../services/encuesta-serv.service';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent implements OnInit {
  encuestas:Encuesta[];
  encuesta:Encuesta=new Encuesta();

  constructor(private router:Router,private servicioEncuesta:EncuestaServService   ) { }

  ngOnInit(): void {
    this.servicioEncuesta.getTodos()
      .subscribe( 
        res => {
          this.encuestas=res;
          //this.encuestas.fechaRespuesta='qqqqqqqq';
        },
        err => console.error(err)
      );
  }

  borrar(encuesta:Encuesta){
    console.log("borrar : "+encuesta.idEncuesta);
    this.servicioEncuesta.borrar(encuesta)
    .subscribe(data=>{
      this.encuestas=this.encuestas.filter(p=>p!==encuesta);
      alert("Se elimino el registro en la BD. ");
      this.router.navigate(["protegida"]);
    });
  }
  
  
}
