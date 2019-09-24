import { Component, OnInit } from '@angular/core';
import { SkillService } from '../skill.service';

@Component({
  selector: 'app-skilltracker',
  templateUrl: './skilltracker.component.html',
  styleUrls: ['./skilltracker.component.css']
})
export class SkilltrackerComponent implements OnInit {

  constructor(private service:SkillService) {

   }

  ngOnInit() {
  }
add(data){
 var asso=this.service.viewassociate(data);
}
}
