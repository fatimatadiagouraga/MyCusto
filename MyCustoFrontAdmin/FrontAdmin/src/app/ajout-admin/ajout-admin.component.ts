import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ServicesService } from '../services.service';

@Component({
  selector: 'app-ajout-admin',
  templateUrl: './ajout-admin.component.html',
  styleUrls: ['./ajout-admin.component.scss']
})
export class AjoutAdminComponent implements OnInit {
  
  

  constructor(private Service :ServicesService) { }
  

  ngOnInit(): void {
  }

  AjoutAdmin(dataAdmin : NgForm){
    this.Service.AjouterAdmin(dataAdmin.value).subscribe(data =>{
     console.log(dataAdmin);
    

    })

  }

}
