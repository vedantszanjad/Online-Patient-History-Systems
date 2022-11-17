import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PatientRegistration } from '../model/patient-registration';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class ResgistrationService {

  constructor(private http: HttpClient) {

  }
  public loginUserFromRemote(login: PatientRegistration): Observable<PatientRegistration> {

    return this.http.post<PatientRegistration>("http://localhost:8080/patient/loginUser", login)
  }

  public registerUserData(register: any): Observable<any> {

    return this.http.post<any>("http://localhost:8080/patient/addPatient", register)

  }

  public findUserById(patientId: number): Observable<PatientRegistration> {
    return this.http.get<PatientRegistration>(`${baseUrl}/patient/getOneUser/` + `${patientId}`);
  }

}

