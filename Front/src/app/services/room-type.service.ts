import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RoomType } from '../model/RoomType';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class RoomTypeService {

  constructor(private http:HttpClient) { }

  public getAllRoomType():Observable<RoomType[]>
  {
    return this.http.get<RoomType[]>(`${baseUrl}/roomType/getAllRoomType`);
  }

  public addRoomType(roomtypes:any):Observable<RoomType>
  {
    return this.http.post<RoomType>(`${baseUrl}/roomType/addRoomType`,roomtypes);
  } 

  public deleteRoomType(roomTypeId:number):Observable<any>
  {
     return this.http.delete<any>(`${baseUrl}/roomType/deleteRoomType/` + `${roomTypeId}`);
  } 

  public findRoomTypeById(roomTypeId:number):Observable<RoomType>
  {
     return this.http.get<RoomType>(`${baseUrl}/roomType/findRoomTypeById/` + `${roomTypeId}`);
  } 

  public updateRoomType(roomtypes:any):Observable<RoomType>
  {
    console.log('calling RoomType service',roomtypes)
    return this.http.put<RoomType>(`${baseUrl}/roomType/updateRoomType/`+roomtypes.roomTypeId,roomtypes);
  } 
}
