import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CartitemsComponent } from './components/cartitems/cartitems.component';
import { CheckoutComponent } from './components/checkout/checkout.component';
import { HeaderComponent } from './components/header/header.component';
import { LoginComponent } from './components/login/login.component';
import { RegistrationComponent } from './components/registration/registration.component';
import { Restaurent1Component } from './components/restaurent1/restaurent1.component';
import { SearchComponent } from './components/search/search.component';
 
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { SliderComponent } from './components/slider/slider.component';



const routes: Routes = [
  
  {path: '',component: SidebarComponent, children : [
    {path: 'rest-1/:r1',component: Restaurent1Component},
    {path: 'rest-2/:r2',component:Restaurent1Component},
    {path: 'rest-3/:r3',component:Restaurent1Component},
    {path: 'rest-4/:r4',component:Restaurent1Component},
    {path:'registration',component:RegistrationComponent},
    {path:'login',component:LoginComponent},
    {path:'search',component:SearchComponent},
    {path:'cartitems',component:CartitemsComponent},
    {path:'checkout',component:CheckoutComponent},
    {path:'',component:SliderComponent}
  ]}

 
 
   
 
   
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
