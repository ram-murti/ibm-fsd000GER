import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule}  from '@angular/forms';
import { SkilltrackerComponent } from './skilltracker/skilltracker.component'

@NgModule({
  declarations: [
    AppComponent,
    SkilltrackerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
