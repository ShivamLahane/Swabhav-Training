import { visitAll } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { NumberApiService } from '../number-api.service';
import { IFact } from './IFact';

@Component({
  selector: 'app-num-api',
  templateUrl: './num-api.component.html',
  styleUrls: ['./num-api.component.css']
})
export class NumApiComponent implements OnInit 
{
  title = 'NumbersApi';
  num : number;
  facts : IFact[];
  msg : string;

  constructor(private service : NumberApiService) 
  { 
    this.msg = '';
    this.num = 0;
    this.facts = [];
  }

  addFactToList() : void
  {
    let color : string;
    if (this.num % 2 == 0)
    {
      color = 'green';
    }
    else
    {
      color = 'red';
    }
    this.facts.unshift(
      {
        number : this.num,
        fact : this.msg, 
        dateTime : Date().toString(), 
        color : color,
        visible : true
      });

  }

  deleteFact(index : number) : void
  {
    this.facts.splice(index, 1);
  }

  getFact() : void
  {
    this.service.getFactAsync(this.num)
      .subscribe((data) =>
      {
        this.msg = data.toString();
        this.addFactToList();
      });
  }

  ngOnInit(): void 
  {

  }

}
