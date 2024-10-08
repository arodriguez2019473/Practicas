import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ConexService } from './conex.service';
import { CommonModule } from '@angular/common';
import { log } from 'console';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  title = 'ejercicio';
  data: any;

  constructor(
    private ejercicioSvc: ConexService
  ) { }

  ngOnInit(): void {
    this.ejercicioSvc.getData().subscribe({
      next:(res) => {
        this.data = res
      },
    })
  }
}
