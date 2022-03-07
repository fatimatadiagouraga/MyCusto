import { Component } from '@angular/core';
import {  OnInit } from '@angular/core';
import { AccueilService } from './accueil.service';
@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss']
})
export class Tab1Page implements OnInit {
  liste: any;
  image: any;
  constructor(private service: AccueilService) {}
  ngOnInit() {
    this.listeplat();
    this.image=this.service.urlImg;
  }

  listeplat(){
    return this.service.getPlatSer().subscribe(data => {
      this.liste= data;
      console.log(this.liste);
    });
  }


}
