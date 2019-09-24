import { Component } from '@angular/core';
import { Status} from './structure/emp';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hello';
  _mes="hgfkhkh";
  detailsFromemp:Status;

  getDetailsFromEmp($event){
    this.detailsFromemp = $event;
    console.log($event);
  }
}
