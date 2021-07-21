import { Component, OnInit } from '@angular/core';
import { RegistrationService } from '../../service/registration.service';
import { User } from '../../model/user';
import { Router } from '@angular/router';

import {NgForm} from '@angular/forms';
import { Route } from '@angular/compiler/src/core';
import { CartService } from '../../service/cart.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user = new User();
  msg='';
  message:string="welcome"+this.user.first_name;
  flag:number=0;
  constructor(private _service : RegistrationService, private _route:Router,private cartService:CartService) { }

  ngOnInit(): void {
    
  }
  //used for login purpose
  loginUser(){
    this._service.loginUserFromRemote(this.user).subscribe(
      data => 
      {
        this.flag=1;
        this.cartService.onLoginSuccess(data.first_name+" "+data.last_name , this.flag);
        this._route.navigate(['rest-1/r1']);
      },
      error =>{
         console.log("exceptions occured");
        this. msg="bad credentials";
      }
    )
   
  }
  
}
