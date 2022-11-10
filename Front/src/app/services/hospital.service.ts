import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Hospital } from '../model/Hospital';
import { Observable } from 'rxjs';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class HospitalService {
  constructor(private http:HttpClient) { }

  public addHospiatl(hospital:any)
  {
    return this.http.post(`${baseUrl}/hospital/addHospital`,hospital);
  } 


  public getAllHospitalList():Observable<Hospital[]>
  {
    return this.http.get<Hospital[]>(`${baseUrl}/hospital/getAllHospitalList`);
  }

  public delete(hospitalId:number):Observable<any>
  {
     return this.http.delete<any>(`${baseUrl}/hospital/deleteHospital/` + `${hospitalId}`);
  }   

  public findHospitalById(hospitalId:number):Observable<Hospital>
  {
     return this.http.get<Hospital>(`${baseUrl}/hospital/findHospitalById/` + `${hospitalId}`);
  } 

  public updateHospital(hospital:any):Observable<Hospital>
  {
    console.log('calling hospital service',hospital)
    return this.http.put<Hospital>(`${baseUrl}/hospital/updateHospital/`+hospital.hospitalId,hospital);
  } 

}
