import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../../service.service';
import { RouterModule } from '@angular/router';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { faCoffee } from '@fortawesome/free-solid-svg-icons';
@Component({
  selector: 'app-home',
  standalone: true,
  imports: [RouterModule,FontAwesomeModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {
  data: any;
  faCoffee = faCoffee;

  constructor(
    private pokensSvc: ServiceService
  ){ }

  ngOnInit(): void{

    this.pokensSvc.getPokens().subscribe({
      next:(res) => {
        this.data = res
      },
    })
  }  

}
