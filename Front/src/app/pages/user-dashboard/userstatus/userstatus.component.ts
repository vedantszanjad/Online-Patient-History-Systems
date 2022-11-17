import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import { first } from 'rxjs';
import { PatientDoctorVisitModule } from 'src/app/model/patient-doctor-visit/patient-doctor-visit.module';
import { PatientHistoryModule } from 'src/app/model/patient-history/patient-history.module';
import { PatientRegistration } from 'src/app/model/patient-registration';
import { PatientRegistrationService } from 'src/app/services/patient-registration.service';
import { UserstatusService } from 'src/app/services/userstatus.service';

@Component({
  selector: 'app-userstatus',
  templateUrl: './userstatus.component.html',
  styleUrls: ['./userstatus.component.css']
})
export class UserstatusComponent implements OnInit {
  id: number = 0;
  register= new PatientRegistration();
  patientHistory= new PatientHistoryModule;


  constructor(private ResgistrationService :PatientRegistrationService,
    private UserstatusService: UserstatusService,
    private snack : MatSnackBar,
    private router:Router, 
    public route: ActivatedRoute) { }

  ngOnInit(): void {
    let patient = JSON.parse(localStorage.getItem("patient")as any)
    this.register=patient;
    console.log(this.register);

  //  localStorage.setItem('patientHistory',JSON.stringify(this.patientHistory));

  //  let patientHistory = JSON.parse(localStorage.getItem("patientHistory")as any)
  //  console.log(this.patientHistory);

    console.log('mapping is running');
    this.UserstatusService.getPatientHistoryById(this.register.patientId)
    .pipe(first())
    .subscribe
    (
      {
        next:(data) =>
        {
          //  console.log(data);  
           this.patientHistory=data;
           console.log(this.patientHistory);
          console.log(this.patientHistory.patientAllergyHistory.patientRegistration.patientId);
          console.log(this.patientHistory.patientDoctorVisitModule.doctor.doctorName);
          }
    });
  }

}
