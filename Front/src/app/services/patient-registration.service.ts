import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import baseUrl from './helper';
import { PatientRegistration } from '../model/patient-registration';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PatientRegistrationService {

  constructor(private http:HttpClient) { }

  public addUser(user:any)
  {
    return this.http.post(`${baseUrl}/patient/addPatient`,user);
  }
  public getAllPatientList():Observable<PatientRegistration[]>
  {
    return this.http.get<PatientRegistration[]>(`${baseUrl}/patient/getAllPatientDetails`);
  }
  public deletePatient(patientId:number):Observable<any>
  {
    return this.http.delete<any>(`${baseUrl}/patient/deletePatient/`+`${patientId}`);
  }

  public findUserById(patientId: number): Observable<PatientRegistration> {
    return this.http.get<PatientRegistration>(`${baseUrl}/patient/getOneUser/` + `${patientId}`);
  }

  public updateUser(user:any):Observable<PatientRegistration>
  {
    console.log('calling hospital service',user)
    return this.http.put<PatientRegistration>(`${baseUrl}/patient/updatePatient/`+ user.patientId,user);
  } 

  
}
