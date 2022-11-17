import { Component, OnInit } from '@angular/core';
import { PatientDoctorVisitModule } from 'src/app/model/patient-doctor-visit/patient-doctor-visit.module';
import { PatientdoctorService } from 'src/app/services/patientdoctor.service';

@Component({
  selector: 'app-patient-doctor',
  templateUrl: './patient-doctor.component.html',
  styleUrls: ['./patient-doctor.component.css']
})
export class PatientDoctorComponent implements OnInit {

  patientDoctor:PatientDoctorVisitModule[];

  constructor(private PatientdoctorService :PatientdoctorService) { }

  ngOnInit(): void {

    console.log('mapping is running');
    this.PatientdoctorService.getAllPatientHistory().subscribe
    (
      {
        next:(data) =>
        {
          this.patientDoctor = data;
          console.log(this.patientDoctor);
        }
      });

  }

}
