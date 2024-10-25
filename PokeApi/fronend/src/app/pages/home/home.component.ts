import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../../service.service';
import { Route, RouterModule } from '@angular/router';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { faCoffee } from '@fortawesome/free-solid-svg-icons';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [RouterModule,FontAwesomeModule,CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {
  data: any;
  faCoffee = faCoffee;
  resultado: string = '';
  mostrarDato: any = null;
  presion: boolean = false;
  constructor(
    private pokensSvc: ServiceService,
    private router: Router,
  ){ }

  ngOnInit(): void{}
    
  
  obtenerdato(): void {
    const numPoke = (document.getElementById('numPoke') as HTMLInputElement).value;
    
    
    this.pokensSvc.getPokens(numPoke).subscribe({
      next: (res) => {
        this.mostrarDato = res;
        console.log(this.mostrarDato)
      }
    })

  }

  presionar() {
    this.presion = !this.presion 
  }

}


// navegacionpoke(){
  
//   const numPoke = (document.getElementById('numPoke') as HTMLInputElement).value;
//     this.router.navigate(['/details', numPoke]);    
// }