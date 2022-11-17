import { Component, OnInit } from '@angular/core';
import { PatientdiseasehistoryModule } from 'src/app/model/patientdiseasehistory/patientdiseasehistory.module';
import { PatientDiseaseServiceService } from 'src/app/services/patient-disease-service.service';

@Component({
  selector: 'app-patient-diseasehistory',
  templateUrl: './patient-diseasehistory.component.html',
  styleUrls: ['./patient-diseasehistory.component.css']
})
export class PatientDiseasehistoryComponent implements OnInit {

  pd : PatientdiseasehistoryModule[];
  constructor(private pdService: PatientDiseaseServiceService) { }

  ngOnInit(): void {
    console.log('mapping is running');
    this.pdService.getAllPatientDiseaseHistory().
    subscribe
    (
      {
        next:(data) =>
        {
          this.pd = data;
          
            console.log(this.pd);
          }
    });
  }

}
