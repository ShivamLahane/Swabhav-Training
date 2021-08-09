import { error } from '@angular/compiler/src/util';
import { Component, OnInit } from '@angular/core';
import { DataServiceService } from '../data-service.service';

@Component({
  selector: 'sw-twoway',
  templateUrl: './two-way-bind.component.html',
  styleUrls: ['./two-way-bind.component.css']
})
export class TwoWayBindComponent implements OnInit 
{
  firstName : string;
  lastName : string;
  constructor(private dataservice : DataServiceService) 
  { 
    this.firstName = 'Abc';
    this.lastName = 'qw';
  }

  updateFirstName(e : any) : void
  {
    console.log(e);
    this.firstName = e;
  }

  ngOnInit(): void 
  {
    console.log("init");
    console.log(this.dataservice.getData());
    console.log(this.dataservice.getDataAsync().subscribe((data) =>
    {
      console.log(data);
    }));
  }
}
