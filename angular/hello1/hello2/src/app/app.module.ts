import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { EditComponent } from './edit/edit.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { TopmenuComponent } from './topmenu/topmenu.component';
import { UsersComponent } from './users/users.component';
import { ProjectModule } from './project/project.module';
import {FormsModule}  from '@angular/forms'
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    EditComponent,
    AboutusComponent,
    TopmenuComponent,
    UsersComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ProjectModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
