import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../model/user';
import {HttpClient} from '@angular/common/http'
 

@ Injectable({
  providedIn: 'root'
})
export class RegistrationService
 {
  

  constructor( private _http : HttpClient) {
    
   }
   //Used for login purpose
   public loginUserFromRemote(user:User):Observable<any>{
     return this._http.post<any>("http://localhost:8085/login",user)

   }
   //Used for signup purpose
   public registerUserFromRemote(user :User):Observable<any>
   {
     return this._http.post<any>("http://localhost:8085/registeruser",user);
   }
   handleError(error : Response)
   { }
}
