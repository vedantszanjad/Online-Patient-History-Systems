import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { PatientRegistrationService } from 'src/app/services/patient-registration.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private PatientRegistrationService:PatientRegistrationService
    ,private snack : MatSnackBar,private router:Router) { }

  public patient =
  {
    patientId:'',
    emailId:'',
    password:'',
    patientFirstName:'',
    patientLastName:'',
    patientAddress:'',
    dob:'',
    gender:'',
    bloodGroup:'',
    mobileNumber:'',
    relativeName:'',
    relativeMobileNumber:'',
    relationWithPatient:''
  }

  ngOnInit(): void {
  }

  formSubmit()
  {
    //alert("Submit")
    console.log(this.patient)
    if(this.patient.emailId =='' || this.patient.emailId==null || this.patient.password =='' || this.patient.password==null )
    {
      alert("User Is Required")
      this.snack.open('User Email Is Required !! ','',
      {
        duration:3000,
        verticalPosition :'top',
      });
      this.router.navigateByUrl('login')
    }
    //Add User
    this.PatientRegistrationService.addUser(this.patient).subscribe(

      (data:any)=>
      {
        //alert("success");
        Swal.fire('success Done!!','user Id is ' + this.patient.emailId,'success')
        console.log(data);
      },
      (error)=>
      {
        console.log(error);
        //alert("Something went Wrong");
        this.snack.open("SomeThing Went Wrong !! ",'',
        {
          duration:3000,
          verticalPosition:'top',
        });
      }
    );
  }
}
