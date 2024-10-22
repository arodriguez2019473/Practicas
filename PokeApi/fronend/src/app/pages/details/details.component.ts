import { Component, Input, OnInit } from '@angular/core';
import { ServiceService } from '../../service.service';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
@Component({
  selector: 'app-details',
  standalone: true,
  imports: [CommonModule,FontAwesomeModule,RouterModule],
  templateUrl: './details.component.html',
  styleUrl: './details.component.css'
})
export class DetailsComponent implements OnInit {
  poke: any;

  constructor(
    private activatedRoute: ActivatedRoute,
    private pokensSvc: ServiceService  
  ){
      
  }
  ngOnInit(): void {
    this.activatedRoute.params.subscribe(params => {
        const id = params['id'];
        this.fetchPokeDetails(id);
    });
  }

  fetchPokeDetails(id: string): void {
    const idNum = Number(id); // aca podemos hacer una conversion siempre tener en cuenta eso por que si no no sabra a donde ir
    this.pokensSvc.getPokens().subscribe({
      next: (res) => {
        this.poke = res.find((poke: any) => poke.id === idNum);
      },
    });
  }
}

