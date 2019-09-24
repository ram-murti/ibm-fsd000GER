import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import {  UserServiceService } from '../user-service.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  users:any
  ngOnInit(){
   //this.users=this.uService.getUser()
   this.users=this.uService.u()
   console.log(this.users)
  }
   
  constructor(private route:ActivatedRoute,private router:Router,private uService:UserServiceService) { }



}
