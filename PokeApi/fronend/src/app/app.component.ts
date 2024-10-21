import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ServiceService } from './service.service';
import { CommonModule } from '@angular/common';
import { privateDecrypt } from 'node:crypto';
import { url } from 'node:inspector';
import { DetailsComponent } from './pages/details/details.component';
import { NgxSpinnerModule } from "ngx-spinner";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,CommonModule,NgxSpinnerModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent implements OnInit {

  type?: string;
  title = 'fronend';
  data: any;

  

  constructor(
    private spinner: NgxSpinnerModule,
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

