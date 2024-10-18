import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../../service.service';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-details',
  standalone: true,
  imports: [],
  templateUrl: './details.component.html',
  styleUrl: './details.component.css'
})
export class DetailsComponent implements OnInit {

  constructor(

    private activatedRoute: ActivatedRoute
  ){}

  ngOnInit(): void {
    console.log(this.activatedRoute.snapshot.paramMap.get('name'))
  }

}