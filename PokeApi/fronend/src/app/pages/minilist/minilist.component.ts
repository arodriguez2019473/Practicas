import { Component, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { faCoffee } from '@fortawesome/free-solid-svg-icons';
import { ServiceService } from '../../service.service';


@Component({
  selector: 'app-minilist',
  standalone: true,
  imports: [RouterModule,FontAwesomeModule],
  templateUrl: './minilist.component.html',
  styleUrl: './minilist.component.css'
})
export class MinilistComponent implements OnInit {
  
  data: any;
  faCoffee = faCoffee;

  constructor(
    private pokensSvc: ServiceService
  ){

  }
  ngOnInit(): void {
    
    this.pokensSvc.getPokenslist().subscribe({
      next:(res) => {
        this.data = res
      },
    })

  }


}
