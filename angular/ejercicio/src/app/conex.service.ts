import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { catchError, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ConexService {

  private endpoint = 'http://localhost:5000/data'

  constructor(
    protected http: HttpClient
  ) { }

  getData(): Observable<any> {
    return this.http.get(this.endpoint).pipe(catchError(err => err))
  }
}
