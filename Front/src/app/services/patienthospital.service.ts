import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PatienthospitalhistoryModule } from '../model/patienthospitalhistory/patienthospitalhistory.module';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class PatienthospitalService {

  constructor(private http: HttpClient) { }

  public getAllList():Observable<PatienthospitalhistoryModule[]>
  {
    return this.http.get<PatienthospitalhistoryModule[]>(`${baseUrl}/ph/getAllPhHistory`);
  }
}
