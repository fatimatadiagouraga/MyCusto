import { Component, OnInit } from '@angular/core';
import { IngredientsListeService } from './Service/ingredients-liste.service';

@Component({
  selector: 'app-plat-details',
  templateUrl: './plat-details.page.html',
  styleUrls: ['./plat-details.page.scss'],
})
export class PlatDetailsPage implements OnInit {
  test: any;

  constructor(private service: IngredientsListeService) { }

  ngOnInit() {
    this.getIngredient();
  }
  getIngredient(){
   return this.service.getIngredientSer().subscribe(data=>{
     this.test = data;
     console.log(this.test);
   });
  }
}
