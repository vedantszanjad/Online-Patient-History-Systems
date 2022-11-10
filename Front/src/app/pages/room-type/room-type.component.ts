import { Component, OnInit } from '@angular/core';
import { RoomType } from 'src/app/model/RoomType';
import { RoomTypeService } from 'src/app/services/room-type.service';

@Component({
  selector: 'app-room-type',
  templateUrl: './room-type.component.html',
  styleUrls: ['./room-type.component.css']
})
export class RoomTypeComponent implements OnInit {

  roomtypes : RoomType[]
  constructor(private RoomTypeService : RoomTypeService) { }

  ngOnInit(): void {
    this.RoomTypeService.getAllRoomType().subscribe
    ({
        next:(data) => {
          this.roomtypes=data;
          console.log(this.roomtypes);
      }
  });
  }

  delete(roomTypeId:number)
  {
   console.log(roomTypeId);
   this.RoomTypeService.deleteRoomType(roomTypeId)
   .subscribe({
    next:(data) => {
      console.log(this.roomtypes);
    }
  });
  }
}
