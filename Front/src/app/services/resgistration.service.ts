import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PatientRegistration } from '../model/patient-registration';

@Injectable({
  providedIn: 'root'
})
export class ResgistrationService {

  constructor(private http:HttpClient) 
  {

  }
  public loginUserFromRemote(login:PatientRegistration):Observable<any>

  {

    return this.http.post<any>("http://localhost:8080/patient/loginUser",login)
  }

  public registerUserData(register:any):Observable<any>

  {

    return this.http.post<any>("http://localhost:8080/patient/addPatient",register)

  }

  
}

