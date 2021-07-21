import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Purchase } from '../model/purchase';

@Injectable({
  providedIn: 'root'
})
export class CheckoutService {

  constructor(public http: HttpClient)
   { 
     
   }
  //Used for passing the details of data transfer object to respective restcontroller class method of spring application
  placeOrder(purchase: Purchase): Observable<any>{
    console.log(purchase);
    return this.http.post<any>("http://localhost:8085/checkout",purchase)
  }
}
