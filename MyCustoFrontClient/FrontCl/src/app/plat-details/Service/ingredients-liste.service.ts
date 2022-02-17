import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class IngredientsListeService {
 url= environment.URL;
  constructor(private http: HttpClient) { }
  getIngredientSer(){
  return  this.http.get(this.url+'/listerIngredient');
  }
}
