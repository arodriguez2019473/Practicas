import { Component, Input, OnInit } from '@angular/core';
import { ServiceService } from '../../service.service';
import { ActivatedRoute } from '@angular/router';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-details',
  standalone: true,
  imports: [CommonModule],
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
      const name = params['name'];
      this.fetchPokeDetails(name);
    });
  }

  fetchPokeDetails(name: string): void {
    this.pokensSvc.getPokens().subscribe({
      next: (res) => {
        this.poke = res.find((poke: any) => poke.name === name);
        console.log(this.poke)
      },
    });
  }

}

