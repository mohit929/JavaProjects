import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SearchService {

  public search:string="";
  constructor() { }
  //Used for storing the searched item from the textbox
  public  storeData(dish:string):void
  {  console.log("storing data"+dish);
     this.search=dish;
  }
  //Used for getting the searched key element
  public getData():string
  {
    return this.search;
  }
}
