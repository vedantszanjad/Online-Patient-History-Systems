import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import { PatientRegistration } from 'src/app/model/patient-registration';
import { PatientRegistrationService } from 'src/app/services/patient-registration.service';
import { ResgistrationService } from 'src/app/services/resgistration.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent implements OnInit {
 
  id: number = 0;


  public register = 
  {

    patientId: '',
      
      emailId: '',
  
      password:'',
  
      patientFirstName: '',
  
      patientLastName: '',
  
      patientAddress: '',
  
      dob: '',
  
      gender: '',
  
      bloodGroup: '',
  
      mobileNumber: '',
  
      relativeName: '',
  
      relativeMobileNumber: '',
  
      relationWithPatient: '',
  
      roleId:'',
  }

  constructor(private ResgistrationService: PatientRegistrationService,private snack : MatSnackBar,private router:Router, public route: ActivatedRoute) { }

 

  ngOnInit(): void {
   
    this.id = this.route.snapshot.params['id'];
    console.log("router param id is :: " + this.register.patientId);
    if (this.id > 0) {
    console.log(this.id)
      this.ResgistrationService.findUserById(this.id)
        .subscribe(
          (data: any) => {
            console.log('data is renderd', data)
            this.register = data
            console.log(this.register, 'assigned data to doc')

          },
          (error) => {
            console.log(error)

          }
        );
    }
  }

  formSubmit() {
    let patient = JSON.parse(localStorage.getItem("patient")as any)
    this.register = patient;
    if (this.register.patientId === '') {
      this.ResgistrationService.addUser(this.register).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('success Done!!', 'user Id is ' + this.register.patientId, 'success')
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

      this.ResgistrationService.updateUser(this.register).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('doctor updated sucessfully!!', 'doctor. Id is ' + this.register.patientId, 'success')
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
