import { Component, OnInit } from '@angular/core';
import { ServicesService } from '../services.service';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-list-admin',
  templateUrl: './list-admin.component.html',
  styleUrls: ['./list-admin.component.scss']
})
export class ListAdminComponent implements OnInit {

  constructor(private s :ServicesService,public snackbar:MatSnackBar) { }
  administrateurs:any;
 

  ngOnInit(): void {

    this.listAdmin();
  }
  listAdmin(){
    return this.s.ListeAdmin().subscribe(data => {
      this.administrateurs =data;
      console.log(this.administrateurs);
    });
  }

  SuppAdmin(idadmin:any){
    this.s.SupprimerAdmin(idadmin).subscribe(data =>{
      console.log(data);
      this.snackbar.open('suppression','X', {
                  duration: 3000
                });
      this.ngOnInit();
      
    }
    );
    
  }

}
