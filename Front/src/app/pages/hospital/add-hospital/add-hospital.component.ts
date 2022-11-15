import { Component, OnInit } from '@angular/core';
import { HospitalService } from 'src/app/services/hospital.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-add-hospital',
  templateUrl: './add-hospital.component.html',
  styleUrls: ['./add-hospital.component.css']
})
export class AddHospitalComponent implements OnInit {

  id: number = 0;
  constructor(private HospitalService : HospitalService,private snack : MatSnackBar,private router:Router, public route: ActivatedRoute) { }
  public hospital =
  {
   hospitalId:'',
   hospitalName:'',
   hospitalAddress:'',
   hospitalCreatedDate:'',
   hospitalCharges:''
  }

  ngOnInit(): void {
    this.id = this.route.snapshot.params["id"];
    console.log("router param id is :: "+this.id);

    if (this.id > 0) {
      
      this.HospitalService.findHospitalById(this.id)
        .subscribe(
          (data: any) => {
            console.log('data is renderd',data)
            this.hospital = data
            console.log(this.hospital,'assigned data to doc')

          },
          (error) => {
            console.log(error)

          }
        );
    }
  }


  formSubmit() {
    if (this.hospital.hospitalId === '') {
      this.HospitalService.addHospiatl(this.hospital).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('success Done!!', 'user Id is ' + this.hospital.hospitalId, 'success')
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

        this.router.navigate(['../'],{relativeTo: this.route});
    }
    else {

      this.HospitalService.updateHospital(this.hospital).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('hospital updated sucessfully!!', 'hospital. Id is ' + this.hospital.hospitalId, 'success')
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

     this.router.navigate(['../'],{relativeTo: this.route});
    }

  }
}