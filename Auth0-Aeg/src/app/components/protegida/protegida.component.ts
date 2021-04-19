import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-protegida',
  templateUrl: './protegida.component.html',
  styleUrls: ['./protegida.component.css']
})
export class ProtegidaComponent implements OnInit {

  constructor(private router:Router ) { }

  ngOnInit(): void {
  }
  listar(){
    console.log("lista");
    this.router.navigate(["lista"]);
  }  

  nuevo(){
    console.log("nuevo");
    this.router.navigate(["nuevo"]);
  }  

 
}
