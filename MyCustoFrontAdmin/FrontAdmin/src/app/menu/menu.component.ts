import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../services.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {

  menus :any;

  constructor(private s :ServicesService) { }

  ngOnInit(): void {
    this.listMenu();
    
  }
  listMenu(){
    return this.s.listemenu().subscribe(data =>{
    this.menus=data;
    console.log(this.menus)
    })
  }

}
