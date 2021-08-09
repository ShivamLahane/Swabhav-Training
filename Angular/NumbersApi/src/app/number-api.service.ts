import { Injectable } from '@angular/core';
import { Observable, Subscriber } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class NumberApiService 
{

  constructor(private http : HttpClient) 
  { 

  }

  getFactAsync(number : number) : Observable<String>
  {
    let obj : Observable<String> = this.http.get("http://numbersapi.com/" + number, { responseType : 'text'});
    return obj ;
  }

}
