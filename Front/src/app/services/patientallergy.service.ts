import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { PatientallergyhistoryModule } from '../model/patientallergyhistory/patientallergyhistory.module';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class PatientallergyService {

  constructor(private http:HttpClient) { }

  public getAllList():Observable<PatientallergyhistoryModule[]>
  {
    return this.http.get<PatientallergyhistoryModule[]>(`${baseUrl}/pallergy/getAllPaHistory`);
  }
}
