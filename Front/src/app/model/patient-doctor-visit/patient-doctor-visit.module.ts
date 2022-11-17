import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PatientRegistration } from '../patient-registration';
import { Doctor } from '../Doctor';



@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})
export class PatientDoctorVisitModule 
{
  pdvId:number;
  patientRegistration:PatientRegistration;
  doctor:Doctor;
  visitDate:string;
  nextVisitDate:string;
}
