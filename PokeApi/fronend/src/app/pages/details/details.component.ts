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

  name: string = '';
  imagen: string = '';
  versions: string = '';
  movements: string = '';
  // entity: any
  // entityname: any
  // entitymovent: any

  // moviments: any
  // poke: { name: string; movements: string; versions: string } = { name: '', movements: '', versions: '' };

  constructor(
    private activatedRoute: ActivatedRoute,
  ){
      
    // this.name = '';
    // this.imagen = '';
    // this.versions = '';
    // this.movements = '';
  }

  ngOnInit(): void {

    this.activatedRoute.paramMap.subscribe(params => {
      this.name = params.get('name') || '';
    });

    this.activatedRoute.queryParams.subscribe(params =>{
      this.movements = params['movements'] || '';
      this.versions = params['versions'] || '';
    });


    // this.name = this.poke.name
    // this.imagen = this.poke.imagen
    // this.versions = this.poke.versions
    // this.movements = this.poke.movements

    // console.log(this.name)

    // this.poke.name = this.activatedRoute.snapshot.params['name'];
    // this.poke.movements = this.activatedRoute.snapshot.params['movements'];
    // this.poke.versions = this.activatedRoute.snapshot.params['versions'];
    //   console.log(this.activatedRoute)
    //   console.log(this.aname);
    //   console.log(this.aimge);
    //   console.log(this.moviments);
    // };
  }
}