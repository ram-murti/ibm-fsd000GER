import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import {  UserServiceService } from '../user-service.service';
@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
    registerObject:users;
  registerObj: any;
  constructor(private route:ActivatedRoute,private router:Router,private uService:UserServiceService) { }

  ngOnInit() {
   this.registerObj={
     name:"abc",
     Id:1,
     pass:"abc"
   }
   this.registerObj = this.uService.u();
  }
  
  redirect(){
    this.router.navigate(['edit']);
  }
  redirectToAboutus(){
    this.router.navigate(['/aboutus'], { queryParams: {id:7 , name:'ibm' } });
  }
  add(_data){
    console.log('User Logged In');
    console.log(_data);

    this.registerObj=this.uService.AddUser(_data);
    console.log(this.registerObj);
    this.router.navigate(['home']);
  }
  Delete(id){
    this.registerObj= this.uService.Delete1(id);
     
          
    }
  
}
export interface users{
  Id:number,
  name:string,
  pass:string

}
