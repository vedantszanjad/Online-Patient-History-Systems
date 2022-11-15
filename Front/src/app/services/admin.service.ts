import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Admin } from '../model/admin';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http : HttpClient) { }

  public getAdminList():Observable<Admin[]>
  {
    return this.http.get<Admin[]>(`${baseUrl}/admin/getAllAdminDetails`);
  }

  public addAdmin(admin:any):Observable<Admin>
  {
    return this.http.post<Admin>(`${baseUrl}/admin/addAdmin`,admin);
  }

  public deleteAdmin(adminId:number):Observable<any>
  {
   return this.http.delete<any>(`${baseUrl}/admin/deleteAdmin/` + `${adminId}`);
  }

  public findAdminById(adminId:number):Observable<Admin>
  {
     return this.http.get<Admin>(`${baseUrl}/admin/findAdminById/` + `${adminId}`);
  } 
  
  public updateAdmin(admin:any):Observable<Admin>
  {
    console.log('calling Diseases service',admin)
    return this.http.put<Admin>(baseUrl+"/admin/updateAdmin/"+`${admin.adminId}`,admin);
  } 

}
