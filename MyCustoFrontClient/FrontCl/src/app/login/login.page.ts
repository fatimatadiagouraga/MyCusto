import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ConnexionService } from '../connexion.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.page.html',
  styleUrls: ['./login.page.scss'],
})
export class LoginPage implements OnInit {

  constructor(private service: ConnexionService ) { }

  ngOnInit() {
  }
  onLogin(form: NgForm){
    this.service.loginClient(form.value.username,form.value.password).subscribe((res: any) =>{
      console.log(res);
      if(res){
      console.log('connexion reussi avec succès');
    }
    });


}
}
