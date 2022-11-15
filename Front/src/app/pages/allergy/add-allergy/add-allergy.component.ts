import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';
import { MatSnackBar } from '@angular/material/snack-bar';
import { AllergyService } from 'src/app/services/allergy.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-add-allergy',
  templateUrl: './add-allergy.component.html',
  styleUrls: ['./add-allergy.component.css']
})
export class AddAllergyComponent implements OnInit {

  constructor(private AllergyService:AllergyService,
    private snack: MatSnackBar,
    private router: Router,
    public route: ActivatedRoute) { }
  public allergy =
    {
      aId: '',
      allergyName: '',
      allergyType: ''
    }

  ngOnInit(): void {
  }

  formSubmit(){
    this.AllergyService.addAllergy(this.allergy).subscribe
    (
      (data:any) =>{
        console.log(this.data)
        Swal.fire('success Done!!', 'allergy Id is ' + this.allergy.aId, 'success')
      },
      (error) => {
        console.log(error)
        this.snack.open("SomeThing Went Wrong !! ", '',
          {
            duration: 3000,
            verticalPosition: 'top',
          });
        })
  }
  data(data: any) {
    throw new Error('Method not implemented.');
  }

}
