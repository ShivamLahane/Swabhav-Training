import { Injectable } from '@angular/core';
import { Observable, Subscriber } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService 
{
  getData() : number
  {
      return Math.random() * 1;
  }
  getDataAsync() : Observable<Number>
  {
      let observable = Observable.create( (subscriber : Subscriber<Number>)=> 
                                          {
                                              subscriber.next(Math.random() * 10);
                                              subscriber.next(Math.random() * 100);
                                              subscriber.complete();
                                          });
      return observable
  }
  constructor() 
  { 

  }
}
