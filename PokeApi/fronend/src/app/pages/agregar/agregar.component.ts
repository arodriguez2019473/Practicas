import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../../service.service';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { FormArray, FormControl, FormControlName, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-agregar',
  standalone: true,
  imports: [CommonModule, FontAwesomeModule, RouterModule, ReactiveFormsModule],
  templateUrl: './agregar.component.html',
  styleUrl: './agregar.component.css'
})
export class AgregarComponent implements OnInit {

  test = []

  form = new FormGroup({
    nombre: new FormControl(null),
    tipo: new FormControl(null),
    img: new FormControl(null),
    esleg: new FormControl(null),
    movimientos: new FormArray([new FormControl(null)])
  });

  nombre: string = '';
  tipo: string = '';
  img: string = '';
  esleg: boolean = false;
  // movimientos: string = '';

  constructor(
    private pokensSvc: ServiceService,
    private activatedRoute: ActivatedRoute

  ) { }

  get movimientos() {
    return this.form.get('movimientos') as FormArray;
  }

  ngOnInit(): void {
  }

  guardarPoke(): void {

    this.pokensSvc.postPokens(this.form.value).subscribe(
      response => {
        console.log(response)
      }
    )
  }

  movimientosa(): void{

    this.movimientos.push(new FormControl(''))
  }

}
