import { error } from '@angular/compiler/src/util';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RegistrationService } from '../../service/registration.service';
import { User } from '../../model/user';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
user= new User();
msg='';

  constructor(private _service : RegistrationService, private _router : Router) { }

  ngOnInit(): void {
  }
  //used for registering the user details as filled in the form
  registerUser()
  {  
  this._service .registerUserFromRemote(this.user).subscribe(
  data =>{
    console.log("response recieved");
    alert("registered succesfully");
    this._router.navigate(['login']);
    
  },
  error => {
    console.log("exception occured");
    this.msg=error.error;
    
  }
  
)
  }
}
