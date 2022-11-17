import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PatientRegistration } from '../patient-registration';
import { Disease } from '../Disease';



@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})
export class PatientdiseasehistoryModule 
{
  pdhI:number;
  seviretyOfDisease:string;
  patientRegistration:PatientRegistration;
  disease:Disease;
 }
