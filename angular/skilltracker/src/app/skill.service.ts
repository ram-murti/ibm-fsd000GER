import { Injectable } from '@angular/core';
import { findReadVarNames } from '@angular/compiler/src/output/output_ast';
import { EMPTY_PARSE_LOCATION } from '@angular/compiler';

@Injectable({
  providedIn: 'root'
})
export class SkillService {

  constructor() { }

  viewassociate(associate){
   
var fname=associate.associateFirstname;
var lname=associate.associateLastname;
var email=associate.email;
var number=associate.associateMobilenumber;
  const url = 'http://localhost:8080/Associate/viewAll' ;
    fetch(url, {
            method: 'POST',
            headers: {
                'username': 'tech',
                'password': 'tech',
                'content-type': 'application/json'
            },
            body: JSON.stringify({
              associateFirstname:fname,
              associateLastname:lname,
              email:email,
              associateMobilenumber:number
            })
        })
  }
}
