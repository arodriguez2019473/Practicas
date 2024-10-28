import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable } from 'rxjs';

@Injectable({
  
  providedIn: 'root'

})
export class ServiceService {

  private pokensendp = "http://localhost:5000/pokemon"
  private pokelist = "http://localhost:5000/pokens"  
  private pokeagregar = "http://localhost:5000/pokeAgreg"

  constructor( protected http: HttpClient ) { }

  getPokens(pokemonName: string ): Observable<any>{  
  
    return this.http.get(`${this.pokensendp}/${pokemonName}`).pipe(catchError(err => err))
  
  }
  getPokenslist(): Observable<any>{
  
    return this.http.get(this.pokelist).pipe(catchError(err => err))
  
  }

  postPokens( newPoke:any ): Observable<any>{

    return this.http.post(this.pokeagregar, newPoke).pipe(catchError(err => err))

  }

  

}

