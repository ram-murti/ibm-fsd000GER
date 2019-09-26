import { Component, OnInit } from '@angular/core';
import { SkillService } from '../skill.service';

@Component({
  selector: 'app-skilltracker',
  templateUrl: './skilltracker.component.html',
  styleUrls: ['./skilltracker.component.css']
})
export class SkilltrackerComponent implements OnInit {
   get: any[];
   selectedDay: string = '';
   fetch:  any[];
   getSearch:  any;
  constructor(private service:SkillService) {

   }

  ngOnInit() {
  }
add(data){
  console.log(data)
 this.service.addAssociate(data);
}
viewAll(){
this.service.viewAssociate((data: { body: any[]; })=>{
  this.get=data.body;
});

}
selectChangeHandler (event: any) {
  //update the ui
  this.selectedDay = event.target.value;
  console.log(this.selectedDay);
  
}
 search(data){
this.getSearch=data.search;
if(this.selectedDay="associateFirstName"){
  this.service.findByfName((data)=>{
  this.fetch=data.body;
  },this.getSearch);
}
 }

}
