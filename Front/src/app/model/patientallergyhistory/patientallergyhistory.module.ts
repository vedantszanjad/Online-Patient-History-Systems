import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PatientRegistration } from '../patient-registration';
import { Allergy } from '../Allergy';



@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})
export class PatientallergyhistoryModule 
{
  pahId:number;
  patientRegistration:PatientRegistration;
  allergy:Allergy;
 }
