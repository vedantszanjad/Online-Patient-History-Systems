import { Component, OnInit } from '@angular/core';
import { DoctorService } from 'src/app/services/doctor.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import Swal from 'sweetalert2';
import { Doctor } from 'src/app/model/Doctor';

@Component({
  selector: 'app-add-doctor',
  templateUrl: './add-doctor.component.html',
  styleUrls: ['./add-doctor.component.css']
})
export class AddDoctorComponent implements OnInit {

  id: number = 0;
  // doctor:Doctor= new Doctor;

  constructor(private DoctorService: DoctorService,
    private snack: MatSnackBar,
    private router: Router,
    public route: ActivatedRoute) { }

  public doctor =
    {
      doctorId: '',
      doctorName: '',
      doctorMobileNumber: '',
      doctorAge: '',
      doctorGender: '',
      doctorQualification: '',
      doctorSpecification: '',
    }

  ngOnInit(): void {
    this.id = this.route.snapshot.params["id"];
    console.log("router param id is :: "+this.id);

    if (this.id > 0) {
      
      this.DoctorService.findDoctorById(this.id)
        .subscribe(
          (data: any) => {
            console.log('data is renderd',data)
            this.doctor = data
            console.log(this.doctor,'assigned data to doc')

          },
          (error) => {
            console.log(error)

          }
        );
    }


  }

  formSubmit() {
    if (this.doctor.doctorId === '0') {
      this.DoctorService.addDoctor(this.doctor).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('success Done!!', 'user Id is ' + this.doctor.doctorId, 'success')
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

      this.DoctorService.updateDoctor(this.doctor).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('doctor updated sucessfully!!', 'doctor. Id is ' + this.doctor.doctorId, 'success')
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

