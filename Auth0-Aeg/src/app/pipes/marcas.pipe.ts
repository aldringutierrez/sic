import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'marcas'
})
export class MarcasPipe implements PipeTransform {

  transform(codigo: number): string {
    if(codigo==1){
      return "Intel";
    }
    if(codigo==2){
      return "Amd";
    }
    if(codigo==3){
      return "Mac";
    }
    return "";
  }

}
