import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PatientDoctorVisitModule } from '../model/patient-doctor-visit/patient-doctor-visit.module';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class PatientdoctorService {

  constructor(private http: HttpClient) { }

  public getAllPatientHistory():Observable<PatientDoctorVisitModule[]>
  {
  
    return this.http.get<PatientDoctorVisitModule[]>(`${baseUrl}/patientDoctorVisit/getAllpatientDoctorVisit`);
  }
}
