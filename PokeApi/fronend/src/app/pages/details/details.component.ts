import { Component, Input, OnInit } from '@angular/core';
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

  // aname!: string
  // aimge!: string
  // amoviments!: string
  

  // moviments: any
  poke: { name: string; movements: string; versions: string } = { name: '', movements: '', versions: '' };

  constructor(
    private activatedRoute: ActivatedRoute,

  ){}

  ngOnInit(): void {

    this.poke.name = this.activatedRoute.snapshot.params['name'];
    this.poke.movements = this.activatedRoute.snapshot.params['movements'];
    this.poke.versions = this.activatedRoute.snapshot.params['versions'];

    //   console.log(this.aname);
    //   console.log(this.aimge);
    //   console.log(this.moviments);
    // };
  }
}