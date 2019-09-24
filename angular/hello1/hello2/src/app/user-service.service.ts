import { Injectable } from '@angular/core';
import { users } from './users/users.component';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
   users:any
   index:number
   User:any
  constructor() {
    this.users= []
   }
    AddUser(_user){
      console.log(_user)
      this.users.push(_user)
      console.log(this.users)
      return this.users
    }
    Delete1(id){
      
   this.users.find((e,i)=>{
      this.index = i  
      return e.id==id
    })
    this.users.splice(this.index,1)
    return this.users
  
  }
  u(){
    console.log(this.users)
    return this.users
  }
  Finduser(id){
     this.User= this.users.find(e=>{
               return e.Id==id
     })
     return this.User
  }
  Updateuser(id,Update){
     this.users.forEach(e => {
      if( e.Id==id){
       e.name=Update.name;
       e.pass=Update.pass;
  }
     })
     return this.users
}
}
