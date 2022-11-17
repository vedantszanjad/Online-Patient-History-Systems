import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PatientRegistration } from '../patient-registration';
import { Medicine } from '../Medicine';



@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})
export class PatientmedicineModule
{
  pmhId:number;
  patientRegistration:PatientRegistration;
  medicine:Medicine;
  dose:string;
 }
