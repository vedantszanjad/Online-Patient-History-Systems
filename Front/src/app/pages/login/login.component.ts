import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { first } from 'rxjs';
import { PatientRegistration } from 'src/app/model/patient-registration';
import { ResgistrationService } from 'src/app/services/resgistration.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  register= new PatientRegistration();

  constructor(private registration: ResgistrationService, private router: Router,
    private location: Location

  ) { }

  ngOnInit(): void {

  }

  loginUser() {


    this.registration.loginUserFromRemote(this.register)
    .pipe(first())
    .subscribe({
      next:(data) =>
      {
        this.register=data
        console.log(this.register.roleId);
        localStorage.setItem('patient',JSON.stringify(this.register))
        alert(" Login Successful")
        if(this.register.roleId == 1)
        {
          this.router.navigateByUrl("admin")
          
        }
        else  if(this.register.roleId>1)
        {
          this.router.navigateByUrl("user")
        }
        
      },
      error :(err) =>
      {
        console.log(err);
        alert("please enter valid EmailId and Password")
        window.location.reload();
      }
    })
  }
}
