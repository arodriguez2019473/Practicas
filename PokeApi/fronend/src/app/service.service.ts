import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { error } from 'console';
import { catchError, Observable } from 'rxjs';

@Injectable({
  
  providedIn: 'root'

})
export class ServiceService {

  private pokensendp = "http://localhost:5000/pokens"
  private resultget = "http://localhost:5000/pokenresult"

  constructor( protected http: HttpClient ) { }

  getPokens(): Observable<any>{
  
    return this.http.get(this.pokensendp).pipe(catchError(err => err))
  
  }

  getResult(): Observable<any>{

    return this.http.get(this.resultget).pipe(catchError(err => err))

  }

}
