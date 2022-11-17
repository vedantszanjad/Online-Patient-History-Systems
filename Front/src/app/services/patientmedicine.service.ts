import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PatientmedicineModule } from '../model/patientmedicine/patientmedicine.module';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class PatientmedicineService {

  constructor(private http:HttpClient) 
  {
   }

   public getAllPatientMedicineHistory():Observable<PatientmedicineModule[]>
   {
   
     return this.http.get<PatientmedicineModule[]>(`${baseUrl}/pm/getAllPatientMedicineHistory`);
   }
  
}
