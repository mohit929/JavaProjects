import { Component, OnInit } from '@angular/core';
import { Restaurant } from '../../model/restaurant';
import { SearchService } from '../../service/search.service';
import restaurants from '../../jsonFile/restaurant.json'
import { CartService } from '../../service/cart.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  restaurant:Restaurant[];
   dish:string="";
  constructor(public service:SearchService,public cartService:CartService) { 
    this.restaurant=restaurants;
    this.dish=this.service.getData();
  }

  ngOnInit(): void {
  }
  ngOnChange()
 {
   localStorage.clear();
 }
  //adding the dishId for the add to cart button has been clicked
   OnAddCart(dishId:string){
     console.log("in the cart");
    this.cartService.storeCart(dishId);
   
   }

}  

