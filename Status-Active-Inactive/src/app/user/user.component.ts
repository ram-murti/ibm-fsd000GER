import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
   user:string[]
   employee:employee[]
  constructor() {
    this.user=[
      "ab",
      "abcd"
    ]
    this.employee=[
      {
        id:1,
         name:"murti" 
      },
      {
        id:2,
         name:"murti1" 
      }
    ]
   }
  
  ngOnInit() {
  }
 
}
interface employee{
  id:number,
  name:string
}