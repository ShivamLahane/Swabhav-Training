import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'welcome-comp',
  templateUrl: './welcome.component.html',
})
export class WelcomeComponent implements OnInit 
{

  msg :  string;

  constructor() 
  { 
    this.msg = 'Welcome to component welcome';
  }

  ngOnInit(): void {
  }

}
