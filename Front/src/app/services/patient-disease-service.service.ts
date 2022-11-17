import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PatientdiseasehistoryModule } from '../model/patientdiseasehistory/patientdiseasehistory.module';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class PatientDiseaseServiceService {

  constructor(private http:HttpClient) { }

  public getAllPatientDiseaseHistory():Observable<PatientdiseasehistoryModule[]>
  {
  
    return this.http.get<PatientdiseasehistoryModule[]>(`${baseUrl}/pd/getAllHistory`);
  }
}
