import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Allergy } from '../model/Allergy';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class AllergyService {

  constructor(private http :HttpClient) { }

  public getAllAllergyList():Observable<Allergy[]>
  {
    return this.http.get<Allergy[]>(`${baseUrl}/allergy/getAllAllergyList`);
  }

  public addAllergy(allergy:any):Observable<Allergy>
  {
    return this.http.post<Allergy>(`${baseUrl}/allergy/addAllergy`,allergy);
  }
  
  public deleteAllergy(aId:number):Observable<any>
  {
    return this.http.delete<any>(`${baseUrl}/allergy/deleteAllergy/`+`${aId}`);
  }
}
