import { Component, OnInit } from '@angular/core';
import { MedicineService } from 'src/app/services/medicine.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-add-medicine',
  templateUrl: './add-medicine.component.html',
  styleUrls: ['./add-medicine.component.css']
})
export class AddMedicineComponent implements OnInit {

  constructor(private MedicineService : MedicineService,private snack : MatSnackBar,private router:Router, public route: ActivatedRoute) { }

  id: number = 0;
  public medicine = 
  {
    tabletId:'',
    tabletName:'',
    tabletPrice:'',
    tabletQuantity:'',
    price:'',
  }

  ngOnInit(): void {
    this.id = this.route.snapshot.params["id"];
    console.log("router param id is :: " + this.id);
    if (this.id > 0) {

      this.MedicineService.findMedicineById(this.id)
        .subscribe(
          (data: any) => {
            console.log('data is renderd', data)
            this.medicine = data
            console.log(this.medicine, 'assigned data to doc')

          },
          (error) => {
            console.log(error)

          }
        );
    }
  }

  formSubmit() {

    if (this.medicine.tabletId === '') {
      this.MedicineService.addMedicine(this.medicine).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('success Done!!', 'user Id is ' + this.medicine.tabletId, 'success')
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

      this.MedicineService.updateMedicine(this.medicine).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('doctor updated sucessfully!!', 'doctor. Id is ' + this.medicine.tabletId, 'success')
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

      //  this.router.navigate(['../'],{relativeTo: this.route});
    }
    // this.router.navigate(['../'],{relativeTo: this.route});
  }

}
