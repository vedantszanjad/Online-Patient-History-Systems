import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PatientRegistration } from 'src/app/model/patient-registration';
import { ResgistrationService } from 'src/app/services/resgistration.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  register=new PatientRegistration();

  constructor(private registration:ResgistrationService,private router:Router,
    private location:Location
    
    ) { }

  ngOnInit(): void {
  }

  loginUser()

  {

  this.registration.loginUserFromRemote(this.register).subscribe(

    data=> {

      console.log("response recieved");

      alert(" Login Successful")

      this.router.navigateByUrl("admin")

    },

    error=>

    {

      console.log("Exception occured");

      alert("please enter valid EmailId and Password")

  //  this.msg="Bad Credentials, please enter valid EmailId and Password";

     window.location.reload();

    }

  )

  }
}
