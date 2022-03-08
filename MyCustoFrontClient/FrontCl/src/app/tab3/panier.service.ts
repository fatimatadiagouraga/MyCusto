import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Commande } from './../tab3/commande.model';


@Injectable({
  providedIn: 'root'
})
export class PanierService {
  apiUrl= 'http://localhost:8088/mycustoapi/commande/';

  private _commande: Commande = new Commande();
  private _commandes: Array<Commande> = [];

  public listeCommandes: any;
  public save(data: Commande){
    this._commandes.push(this.cloneCommande(data));
  }
  public vider(){
    this.commandes = [];
  }

   constructor(private http: HttpClient) { }

   get commande(): Commande{
     if(this._commande == null){
       this._commande = new Commande();
     }
     return this.commande;
   }
   set Commande(value: Commande){
     this._commande = value;
   }

  private cloneCommande(commande: Commande): Commande {
    const myClone = new Commande();
    myClone.administrateur = commande.administrateur;
    myClone.plat = commande.plat;
    myClone.client = commande.client;
    myClone.quatitePlat= commande.quatitePlat;
    return myClone;
  }

}
