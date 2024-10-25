import { Component, Input, OnInit } from '@angular/core';
import { ServiceService } from '../../service.service';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';


@Component({
  selector: 'app-detailslist',
  standalone: true,
  imports: [CommonModule,FontAwesomeModule,RouterModule],
  templateUrl: './detailslist.component.html',
  styleUrl: './detailslist.component.css'
})
export class DetailslistComponent implements OnInit {
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
    const idNum = Number(id);
    this.pokensSvc.getPokens('id').subscribe({
      next: (res) => {
        this.poke = res.find((poke: any) => poke.id === idNum);
      },
    });
  }
}

