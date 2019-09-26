import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SkilltrackerComponent } from './skilltracker/skilltracker.component';


const routes: Routes = [
  {
    path:'skilltracker',
    component: SkilltrackerComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
