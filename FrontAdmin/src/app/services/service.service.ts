import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  apiMenu= 'http://localhost:8080/mycustoapi/menu/';
  apiPlat= 'http://localhost:8080/mycustoapi/plat/';
  apiimage= 'http://localhost:8080/mycustoapi/plat/imageplat/';
  apiAdmin= 'http://localhost:8080/mycustoApi/administrateur/';
  apiCommande= 'http://localhost:8080/mycustoApi/commande/';


  constructor(private http: HttpClient) { }

  login1(login :String,motdepasse : String, admin :any){
    return this.http.post(this.apiAdmin+"login?login="+login+"&motdepasse="+motdepasse,admin)
  }

  ListeAdmin() {
    return this.http.get(this.apiAdmin+'listeAdmin');
  }

  SupprimerAdmin(id:any){
    return this.http.delete(this.apiAdmin+'supprimerAdmin/'+id);
  }

  AjouterAdmin(administrateur:any){
    return this.http.post(this.apiAdmin+'ajoutAdmin',administrateur)
  }

  adminById(id_admin:any){
    return this.http.get(this.apiAdmin+'adminById/'+id_admin)
  }

  ModifAdmin(adminModif:any, id:any){
    return this.http.put(this.apiAdmin+'modifierAdmin/'+id, adminModif);
  }


  //services plats
  //.......................................................
  ListePlat() {
    return this.http.get(this.apiPlat+'listePlat');
  }

  AjoutPlat(plat:any,photo:File){
    const forms: FormData = new FormData();
    forms.append("image", photo)
    return this.http.post(this.apiPlat+'ajoutplat',forms);
  }


  RecupererParId(id:any)
  {
    return this.http.get(this.apiPlat+'platById/'+id);
  }

  ModifPlat(id:any,platmodif:any){
    return this.http.put(this.apiPlat+'modifierPlat/'+id, platmodif);
  }

  SupprimerPlat(id:any){
    return this.http.delete(this.apiPlat+'supprimerPlat/'+id);
  }

  //services menus
  //.......................................................
  listemenu(){
    return this.http.get(this.apiMenu+'listeMenu');
  }

  menuparid(id_menu:any){
    return this.http.get(this.apiMenu+'menubyId/'+id_menu);
  }

  ajoutermenu(menus:any){
    console.log("menu : ", menus);
    return this.http.post(this.apiMenu+'ajoutMenu',menus);
  }

  supprimermenu(id:any){
    return this.http.delete(this.apiMenu+'supprimerMenu/'+id);
  }

  modifmenu(id_menu : any, menumodif : any){
    return this.http.put(this.apiMenu+'modifierMenu/'+id_menu,menumodif)
  }

  //Api commande
  liste(){
    return this.http.get(this.apiCommande+'listeCommande');
  }


}