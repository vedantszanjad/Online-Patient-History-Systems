import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PatientallergyhistoryModule } from '../patientallergyhistory/patientallergyhistory.module';
import { PatientdiseasehistoryModule } from '../patientdiseasehistory/patientdiseasehistory.module';
import { PatienthospitalhistoryModule } from '../patienthospitalhistory/patienthospitalhistory.module';
import { PatientmedicineModule } from '../patientmedicine/patientmedicine.module';
import { PatientDoctorVisitModule } from '../patient-doctor-visit/patient-doctor-visit.module';



@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})
export class PatientHistoryModule 
{
  patientHistoryId:'';
  patientAllergyHistory:PatientallergyhistoryModule;
  patientDiseaseHistory:PatientdiseasehistoryModule;
  patientHospitalHistory:PatienthospitalhistoryModule;
  patientMedicineHistory:PatientmedicineModule;
  patientDoctorVisitModule:PatientDoctorVisitModule;
}
