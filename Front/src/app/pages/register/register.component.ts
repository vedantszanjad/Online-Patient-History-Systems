import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import { ResgistrationService } from 'src/app/services/resgistration.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private ResgistrationService: ResgistrationService,
    private snack: MatSnackBar,
    private router: Router,
    public route: ActivatedRoute) { }

  ngOnInit(): void {
  }
  public registration =
    {
      patientId: '',
      emailId: '',
      password: '',
      patientFirstName: '',
      patientLastName: '',
      patientAddress: '',
      dob: '',
      gender: '',
      bloodGroup: '',
      mobileNumber: '',
      relativeName: '',
      relativeMobileNumber: '',
      relationWithPatient: ''
    }
  formSubmit() {
    this.ResgistrationService.registerUserData(this.registration).subscribe
      (
        (data: any) => {
          console.log(this.data)
          Swal.fire('success Done!!', 'patient Id is ' + this.registration.patientId, 'success')
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

