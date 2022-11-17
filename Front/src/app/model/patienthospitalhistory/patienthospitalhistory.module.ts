import { Component, NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PatientRegistration } from '../patient-registration';
import { Hospital } from '../Hospital';



@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})
export class PatienthospitalhistoryModule
 {
  phhId:number;
  patientRegistration:PatientRegistration;
  hospital:Hospital;
  admitDate:string;
  dischargedate:string;
  bill:number;
  }
