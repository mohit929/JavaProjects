import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Address } from '../../model/address';
import { Customer } from '../../model/customer';
import { Order } from '../../model/order';
import { Purchase } from '../../model/purchase';
import { CheckoutService } from '../../service/checkout.service';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {
  order=new Order();
  address=new Address();
  customer=new Customer();
  purchase!:Purchase;
  total_price:any;
  total_quantity:any;
  constructor( public service:CheckoutService,public route:Router) 
  { }
  
  ngDoCheck(){
    this.total_price=localStorage.getItem('total_price');
    this.total_quantity=localStorage.getItem('total_quantity');
   }
  ngOnInit(): void {
  }
  //Fecthing the details from the form and intialzing it to various model classes variable
  register(data:any)
  {  
    this.order.total_price=this.total_price;
    this.order.total_quantity=this.total_quantity;
    this.purchase = new Purchase(this.customer,this.address,this.order);
    console.log(this.purchase);
    this.service.placeOrder(this.purchase).subscribe(
    data =>{
      alert("YOUR ORDER IS GOT PLACED");
      localStorage.clear();
      this.route.navigate(['rest-1/r1']);
      
    },
    error => {
      alert("SOMETHING WENT WRONG");
    })
    
    
     
  }

}
