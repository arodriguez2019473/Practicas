import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../../service.service';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {
  data: any;


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
