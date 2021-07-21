import { Injectable } from '@angular/core';
import restaurants from '../jsonFile/restaurant.json';
import { Restaurant } from '../model/restaurant';
@Injectable({
  providedIn: 'root'
})
export class CartService {
  public search:string="";
  dish:string="";
 total_id:any;
 total_price:number=0;
 restaurant!:Restaurant;
 quantity:number=0;
 cartData:Restaurant[]=[];
 loginSuccessUser!:string;
flag!:number;
   constructor() { 
   }
   //Used for storing the items on which add to cart button had been clicked and also calculating the total_price and total_quantity respectively and setting in the localstorage
   public  storeCart(dishId:string):void
   {  
      this.dish=dishId;
      for(let restaurant of restaurants)
         {
           if(restaurant.id == this.dish)
           {
             this.cartData.push(restaurant); 
           this.total_price=restaurant.price+this.total_price;
           console.log("id is"+this.total_price) 
           let key = 'total_price';
           localStorage.setItem(key, this.total_price.toString());
           this.quantity=this.quantity+1;
           let key1 = 'total_quantity';
           localStorage.setItem(key1, this.quantity.toString());
           console.log(this.cartData);
           localStorage.setItem("users", JSON.stringify(this.cartData));
           }         
        }
   }
        
        // public onCartPlus(rest:Restaurant):number{
        //    for(let rests of restaurants)
        //      {
        //          if(rests.id === rest.id)
        //          {
        //            this.quantity++;
        //          }
        //      }
        //      return this.quantity;
        //    }
           //Setting the values of login user name and flag varibale
           public onLoginSuccess(data:string,flag:number){
            this.flag=flag;
            this.loginSuccessUser=data;
          }
          //Used for fetching the name of logged in user
          public getLoginSuccess():string{
            return this.loginSuccessUser;
          }
          //Used for fetching the flag variable for logged in user
          public getSuccessFlag():number{
            return this.flag;
          }
  
      }