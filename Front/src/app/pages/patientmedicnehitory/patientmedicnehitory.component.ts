import { Component, OnInit } from '@angular/core';
import { PatientmedicineModule } from 'src/app/model/patientmedicine/patientmedicine.module';
import { PatientmedicineService } from 'src/app/services/patientmedicine.service';

@Component({
  selector: 'app-patientmedicnehitory',
  templateUrl: './patientmedicnehitory.component.html',
  styleUrls: ['./patientmedicnehitory.component.css']
})
export class PatientmedicnehitoryComponent implements OnInit {
  pd : PatientmedicineModule[];
  constructor(private pm :PatientmedicineService) { }

  ngOnInit(): void {
    console.log('mapping is running');
    this.pm.getAllPatientMedicineHistory().
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
