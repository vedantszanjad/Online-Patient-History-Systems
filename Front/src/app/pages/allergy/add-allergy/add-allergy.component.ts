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
  id: number = 0;
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
    this.id = this.route.snapshot.params["id"];
    console.log("router param id is :: " + this.id);
    if (this.id > 0) {

      this.AllergyService.findAllergyById(this.id)
        .subscribe(
          (data: any) => {
            console.log('data is renderd', data)
            this.allergy = data
            console.log(this.allergy, 'assigned data to doc')

          },
          (error) => {
            console.log(error)

          }
        );
  }
}

 
  formSubmit() {

    if (this.allergy.aId === '') {
      this.AllergyService.addAllergy(this.allergy).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('success Done!!', 'user Id is ' + this.allergy.aId, 'success')
          },
          (error) => {
            console.log(error)
            this.snack.open("SomeThing Went Wrong !! ", '',
              {
                duration: 3000,
                verticalPosition: 'top',
              });
          }
        );
    }

    else {

      this.AllergyService.updateAllergy(this.allergy).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('doctor updated sucessfully!!', 'doctor. Id is ' + this.allergy.aId, 'success')
          },
          (error) => {
            console.log(error)
            this.snack.open("SomeThing Went Wrong !! ", '',
              {
                duration: 3000,
                verticalPosition: 'top',
              });
          }
        )

       //this.router.navigate(['../'],{relativeTo: this.route});
    }




}
}


