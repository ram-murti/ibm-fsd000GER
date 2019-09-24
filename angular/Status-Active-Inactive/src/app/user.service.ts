import { Injectable } from '@angular/core';
import { Emp } from './structure/emp';
@Injectable({
  providedIn: 'root'
})
export class empService {
  emps:Emp[]
  index: number
  

  constructor() { }
  getEmp(){
  return  this.emps = [
      {
        id:1,
        name:"Murti",
        active:true
      },
      {
        id:2,
        name:"Murti1",
        active:false
      },
    ]
    
  }
  AddEmp(){
    this.emps.push({
      id:3,
      name:"Murti2",
      active:true
    });
   
    return this.emps
  }
  Delete1(id){
    
 this.emps.find((e,i)=>{
    this.index = i  
    return e.id==id
  })
  this.emps.splice(this.index,1)
  return this.emps

}
}