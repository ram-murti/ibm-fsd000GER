import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import {  UserServiceService } from '../user-service.service';
@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css']
})
export class AboutusComponent implements OnInit {
  

  constructor(private route:ActivatedRoute,private router:Router,private uService:UserServiceService) { }
   params:any
   users:any
   Update:any
   
  ngOnInit() {
    this.users = this.uService.u();
   
  }
  Delete(id){
    this.users= this.uService.Delete1(id);      
    }
   Edit(id){
     this.Update=this.uService.Finduser(id);
    
  }
  
}
