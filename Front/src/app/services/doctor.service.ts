import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Doctor } from '../model/Doctor';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  constructor(private http:HttpClient) { }

  public getAllDoctor():Observable<Doctor[]>
  {
    return this.http.get<Doctor[]>(`${baseUrl}/doctor/getAllDoctor`);
  } 
  
  public addDoctor(doctor:any):Observable<Doctor>
  {
    return this.http.post<Doctor>(`${baseUrl}/doctor/addDoctor`,doctor);
  } 

  public deleteDoctor(doctorId:number):Observable<any>
  {
     return this.http.delete<any>(`${baseUrl}/doctor/deleteDoctor/` + `${doctorId}`);
  } 

  public findDoctorById(doctorId:number):Observable<Doctor>
  {
     return this.http.get<Doctor>(`${baseUrl}/doctor/findDoctorById/` + `${doctorId}`);
  } 

  public updateDoctor(doctor:any):Observable<Doctor>
  {
    console.log('calling doctor service',doctor)
    return this.http.put<Doctor>(`${baseUrl}/doctor/updateDoctor/`+doctor.doctorId,doctor);
  } 
  
}
