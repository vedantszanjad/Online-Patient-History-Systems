import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Disease } from '../model/Disease';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class DiseaseTsService {

  constructor(private http:HttpClient) { }
  
  public addDisease(disease:any):Observable<Disease>
  {
    return this.http.post<Disease>(`${baseUrl}/disease/addDisease`,disease);
  }


  public getAllDiseaseList():Observable<Disease[]>
  {
    return this.http.get<Disease[]>(`${baseUrl}/disease/getAllDiseaseList`);
  }

  public deleteDisease(diseaseId:number):Observable<any>
  {
     return this.http.delete<any>(`${baseUrl}/disease/deleteDisease/` + `${diseaseId}`);
  } 

  public findDiseaseById(diseaseId:number):Observable<Disease>
  {
     return this.http.get<Disease>(`${baseUrl}/disease/findDiseaseById/` + `${diseaseId}`);
  } 

  public updateDisease(disease:any):Observable<Disease>
  {
    console.log('calling Diseases service',disease)
    return this.http.put<Disease>(baseUrl+"/disease/updateDisease/"+`${disease.diseaseId}`,disease);
  } 

}
