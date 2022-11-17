import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PatientHistoryModule } from '../model/patient-history/patient-history.module';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class UserstatusService {

  constructor(private http : HttpClient) { }

  public getAllPatientHistory():Observable<PatientHistoryModule[]>
  {
  
    return this.http.get<PatientHistoryModule[]>(`${baseUrl}/patientHistory/getAllPatientHistory`);
  }

  public getPatientHistoryById(patientHistoryId:number):Observable<PatientHistoryModule>
  {
    return this.http.get<PatientHistoryModule>(`${baseUrl}/patientHistory/getPatientHistoryById/`+ `${patientHistoryId}`);
  }
}
