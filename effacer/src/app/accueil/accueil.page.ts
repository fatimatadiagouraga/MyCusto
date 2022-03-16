import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-accueil',
  templateUrl: './accueil.page.html',
  styleUrls: ['./accueil.page.scss'],
})
export class AccueilPage implements OnInit {
  slideOpts: any;
  constructor(public router: Router,private storage: AccueilPage)


  {setTimeout(()=>{
    this.router.navigateByUrl('login');
  },3000);}


  ngOnInit() {

  }
}
