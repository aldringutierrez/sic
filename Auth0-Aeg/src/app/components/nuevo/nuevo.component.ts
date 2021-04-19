import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Encuesta } from '../../modelo/Encuesta';
import { Marca } from '../../modelo/Marca';
import { EncuestaServService } from '../../services/encuesta-serv.service';
import { MarcaService } from '../../services/marca.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-nuevo',
  templateUrl: './nuevo.component.html',
  styleUrls: ['./nuevo.component.css']
})
export class NuevoComponent implements OnInit {
  //marcas:any[]=[{codigo:"1",nombre:"Intel"},{codigo:"2",nombre:"Amd"},{codigo:"3",nombre:"Apple"}]

  encuesta:Encuesta=new Encuesta();
  encuestas:Encuesta[];
  marca:Marca=new Marca();
  marcas:Marca[];
  marcaSelected = new Marca();
  selected: number = 0;
  selected2  = "";


  constructor(private router:Router,
    private encuestaServ:EncuestaServService,
    private marcaServ:MarcaService) { }

  ngOnInit(): void {
    this.marcaServ.getTodos()
      .subscribe( 
        res => {
          this.marcas=res;
          //this.encuestas.fechaRespuesta='qqqqqqqq';
        },
        err => console.error(err)
      );

}


  guardar(encuesta:Encuesta){
    //console.log("selected : "+this.selected);
    encuesta.marcaFavorita=this.selected;
    this.encuestaServ.crear(encuesta)
    .subscribe(data=>{
      alert("Se agrego con exito.");
      this.router.navigate(["protegida"])
    });

  }
  
  
  onChangeMarca(selected:number) {
    //console.log("selected : "+this.selected);
  }
}
