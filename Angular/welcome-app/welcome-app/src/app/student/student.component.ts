import { Component, OnInit } from '@angular/core';
import { IStudent } from './IStudent';

@Component({
  selector: 'sw-student',
  templateUrl: './student.component.html',
})
export class StudentComponent implements OnInit 
{
  student : IStudent;
  students : IStudent[] = [];
  imgMaxWidth : number;
  imgMaxHeight : number;
  color : string;

  constructor() 
  { 
    this.student = { rollNo : 1, cgpa : 10.0, name : 'adfks', picture : '' };
    this.imgMaxHeight = 100;
    this.imgMaxWidth = 100;
    this.color = 'red';
  }

  load() : void
  {
    this.students.push( { rollNo : 1, cgpa : 10.0, name : 'adfks', picture : '' })
  }

  cgpaToColor(student : IStudent) : string
  {
    if (student.cgpa > 7)
    {
      return 'green';
    }
    if (student.cgpa < 7 && student.cgpa > 4)
    {
      return 'yellow';
    }
    return 'red';
  }

  ngOnInit(): void 
  {

  }

}
