import { Injectable } from '@angular/core';
import { findReadVarNames } from '@angular/compiler/src/output/output_ast';
import { EMPTY_PARSE_LOCATION } from '@angular/compiler';

@Injectable({
  providedIn: 'root'
})
export class SkillService {
model: any;
list:  any;
name:  any;
  constructor() { }

  addAssociate(associate){
   
var fname=associate.associateFirstName;
var lname=associate.associateLastName;
var email=associate.email;
var number=associate.associateMobilenumber;
  const url = 'http://localhost:8080/Associate/add' ;
    fetch(url, {
            method: 'POST',
            headers: {
                'content-type': 'application/json'
            },
            body: JSON.stringify({
              associateFirstName:fname,
              associateLastName:lname,
              email:email,
              associateMobilenumber:number
            })
        })
        .then(res=>res.json())
        .then(data=>{
          console.log(data)
        })
  }
  viewAssociate(callback){
  const url = 'http://localhost:8080/Associate/viewAll' ;
    fetch(url, {
            method: 'GET',
            headers: {
                'content-type': 'application/json'
            }
        })
        .then(res=>res.json())
        .then(data=>{
         callback(data);
         console.log(data);
        })

}
  findByfName(callback,name){
    this.name=name;
    const url = 'http://localhost:8080/Associate/fname/${name}' ;
    fetch(url, {
            method: 'GET',
            headers: {
                'content-type': 'application/json'
            }
        })
        .then(res=>res.json())
        .then(data=>{
         callback(data);
         console.log(data);
        })
  }
  findBylName(callback,name){
    this.name=name;
    const url = 'http://localhost:8080/Associate/lname/${name}' ;
    fetch(url, {
            method: 'GET',
            headers: {
                'content-type': 'application/json'
            }
        })
        .then(res=>res.json())
        .then(data=>{
         callback(data);
         console.log(data);
        })
  }
  findByfullName(callback,name){
    this.name=name;
    const url = 'http://localhost:8080/Associate/flname/${name}' ;
    fetch(url, {
            method: 'GET',
            headers: {
                'content-type': 'application/json'
            }
        })
        .then(res=>res.json())
        .then(data=>{
         callback(data);
         console.log(data);
        })
  }
  findByEmail(callback,name){
    this.name=name;
    const url = 'http://localhost:8080/Associate/email/${name}' ;
    fetch(url, {
            method: 'GET',
            headers: {
                'content-type': 'application/json'
            }
        })
        .then(res=>res.json())
        .then(data=>{
         callback(data);
         console.log(data);
        })
  }
  findByMobilenumber(callback,name){
    this.name=name;
    const url = 'http://localhost:8080/Associate/number/${name}' ;
    fetch(url, {
            method: 'GET',
            headers: {
                'content-type': 'application/json'
            }
        })
        .then(res=>res.json())
        .then(data=>{
         callback(data);
         console.log(data);
        })
  }
  updateAssociate(associate: { associateFirstName: any; associateLastName: any; email: any; associateMobilenumber: any; }){
   
    var fname=associate.associateFirstName;
    var lname=associate.associateLastName;
    var email=associate.email;
    var number=associate.associateMobilenumber;
      const url = 'http://localhost:8080/Associate/update' ;
        fetch(url, {
                method: 'POST',
                headers: {
                    'content-type': 'application/json'
                },
                body: JSON.stringify({
                  associateFirstName:fname,
                  associateLastName:lname,
                  email:email,
                  associateMobilenumber:number
                })
            })
            .then(res=>res.json())
            .then(data=>{
              console.log(data)
            })
      }
      deleteById(callback,name){
        this.name=name;
        const url = 'http://localhost:8080/Associate/delete/${name}' ;
        fetch(url, {
                method: 'POST',
                headers: {
                    'content-type': 'application/json'
                }
            })
            .then(res=>res.json())
            .then(data=>{
             callback(data);
             console.log(data);
            })
      }
}
