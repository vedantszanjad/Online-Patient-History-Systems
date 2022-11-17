import { Component, OnInit } from '@angular/core';
import { PatientHistoryModule } from 'src/app/model/patient-history/patient-history.module';
import { PatienthistoryService } from 'src/app/services/patienthistory.service';

@Component({
  selector: 'app-patienthistory',
  templateUrl: './patienthistory.component.html',
  styleUrls: ['./patienthistory.component.css']
})
export class PatienthistoryComponent implements OnInit {

  patientHistory:PatientHistoryModule[];
  constructor(private PatienthistoryService:PatienthistoryService) { }

  ngOnInit(): void {
    console.log('mapping is running');
    this.PatienthistoryService.getAllPatientHistory().
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
