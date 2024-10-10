import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ServiceService } from './service.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  title = '   ';
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
