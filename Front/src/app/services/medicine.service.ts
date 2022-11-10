import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Medicine } from '../model/Medicine';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class MedicineService {

  constructor(private http:HttpClient) { }

  public getAllMedicines():Observable<Medicine[]>
  {
    return this.http.get<Medicine[]>(`${baseUrl}/medicine/getAllMedicines`);
  }

  public addMedicine(medicine:any):Observable<Medicine>
  {
    return this.http.post<Medicine>(`${baseUrl}/medicine/addMedicine`,medicine);
  } 

  public deleteMedicine(tabletId:number):Observable<any>
  {
     return this.http.delete<any>(`${baseUrl}/medicine/deleteMedicine/` + `${tabletId}`);
  } 

  public findMedicineById(tabletId:number):Observable<Medicine>
  {
     return this.http.get<Medicine>(`${baseUrl}/medicine/findMedicineById/` + `${tabletId}`);
  } 

  public updateMedicine(medicine:any):Observable<Medicine>
  {
    console.log('calling Medicine service',medicine)
    return this.http.put<Medicine>(`${baseUrl}/medicine/updateMedicine/`+medicine.tabletId,medicine);
  } 

}
