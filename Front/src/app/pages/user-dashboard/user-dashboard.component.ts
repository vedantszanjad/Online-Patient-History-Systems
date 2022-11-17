import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import { PatientHistoryModule } from 'src/app/model/patient-history/patient-history.module';
import { PatientRegistration } from 'src/app/model/patient-registration';
import { PatientRegistrationService } from 'src/app/services/patient-registration.service';
import { UserstatusService } from 'src/app/services/userstatus.service';

@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.css']
})
export class UserDashboardComponent implements OnInit {
  id: number = 0;
  register= new PatientRegistration();
  patientH = new PatientHistoryModule();
  user:PatientRegistration [];
  patientHistory:PatientHistoryModule;

  constructor(private ResgistrationService :PatientRegistrationService,
    private UserstatusService: UserstatusService,
    private snack : MatSnackBar,
    private router:Router, 
    public route: ActivatedRoute) { }

  ngOnInit(): void {
    let patient = JSON.parse(localStorage.getItem("patient")as any)
    this.register=patient;
    console.log(this.register);
    console.log(this.register.patientId);
    // let ph = console.log(this.patientH.patientHistoryId);
    // console.log(ph)

    console.log('mapping is running');
    this.UserstatusService.getPatientHistoryById(this.register.patientId).
    subscribe
    (
      {
        next:(data) =>
        {
          this.patientHistory = data;  
          console.log(this.patientHistory);
          }
    });
   
}
}
