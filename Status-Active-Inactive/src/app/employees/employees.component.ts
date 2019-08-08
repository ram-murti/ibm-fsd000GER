import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { empService } from '../user.service';
import { Emp, Status } from '../structure/emp';
@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {
    @Input() message:string
    status:Status
    emps:Emp[];
  

    
  @Output() _empDetails = new EventEmitter(); 
  
  constructor(private uEmpService:empService) { }

  ngOnInit() {
    this.emps = this.uEmpService.getEmp();
    this.status = 
    {
      users : 2,
      active : 1,
      inactive : 1
    }
    this._empDetails.emit(this.status);
    console.log(this.status)
  }
  Delete(id){
  this.emps= this.uEmpService.Delete1(id);
   this.updateStatus();
        
  }
  Add(){
    this.emps=this.uEmpService.AddEmp()
   this.updateStatus();
  }
updateStatus(){
  this.status.active=0;
  this.status.inactive=0;
  this.status.users=0;

  this.emps.forEach(e=>{

    if(e.active==true){
     this.status.active +=1;
     this.status.users +=1;
    }
    else{
      this.status.inactive +=1;
      this.status.users +=1;
    }
  })
  this._empDetails.emit(this.status);

}
}
