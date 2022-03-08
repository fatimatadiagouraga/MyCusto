import { Component, OnInit ,Inject} from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import {MatDialog, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { ServicesService } from '../services.service';

@Component({
  selector: 'app-modifier-plat',
  templateUrl: './modifier-plat.component.html',
  styleUrls: ['./modifier-plat.component.scss']
})
export class ModifierPlatComponent implements OnInit {

  monPlat: FormGroup = new FormGroup({});
 

  constructor(@Inject(MAT_DIALOG_DATA) public data: any, private formBuilder: FormBuilder,private service :ServicesService) { }

  ngOnInit(): void {

    // console.log(this.data);
    this.monPlat = this.formBuilder.group({
      // "id_plat": new FormControl(this.data.route.id_plat),
      "nom_plat": new FormControl(this.data.route.nom_plat),
      "prix_plat": new FormControl(this.data.route.prix_plat),
      "description": new FormControl(this.data.route.description),
      "image": new FormControl(this.data.route.image)

    })

    
  }

  modifplat(){ 
   
    this.service.ModifPlat(this.data.route.id_plat,this.monPlat.value).subscribe(data =>{
     console.log(data);
   });
     
  }
 


}
