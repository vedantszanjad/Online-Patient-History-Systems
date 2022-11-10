import { Component, OnInit } from '@angular/core';
import { RoomTypeService } from 'src/app/services/room-type.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-add-room-type',
  templateUrl: './add-room-type.component.html',
  styleUrls: ['./add-room-type.component.css']
})
export class AddRoomTypeComponent implements OnInit {

  constructor(private RoomTypeService : RoomTypeService,private snack : MatSnackBar,private router:Router, public route: ActivatedRoute) { }
  id: number = 0;
  public roomtype =
  {
    roomTypeId:'',
    roomTypeName:'',
	  pricePerDay:'',
  }

  ngOnInit(): void {
    this.id = this.route.snapshot.params["id"];
    console.log("router param id is :: " + this.id);
    if (this.id > 0) {

      this.RoomTypeService.findRoomTypeById(this.id)
        .subscribe(
          (data: any) => {
            console.log('data is renderd', data)
            this.roomtype = data
            console.log(this.roomtype, 'assigned data to doc')

          },
          (error) => {
            console.log(error)

          }
        );
    }
  }

  formSubmit() {
    if (this.roomtype.roomTypeId === '') {
      this.RoomTypeService.addRoomType(this.roomtype).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('success Done!!', 'user Id is ' + this.roomtype.roomTypeId, 'success')
          },
          (error) => {
            console.log(error)
            this.snack.open("SomeThing Went Wrong !! ", '',
              {
                duration: 3000,
                verticalPosition: 'top',
              });
            }
            );
          }
          else {

            this.RoomTypeService.updateRoomType(this.roomtype).subscribe
              (
                (data: any) => {
                  console.log(data)
                  Swal.fire('doctor updated sucessfully!!', 'doctor. Id is ' + this.roomtype.roomTypeId, 'success')
                },
                (error) => {
                  console.log(error)
                  this.snack.open("SomeThing Went Wrong !! ", '',
                    {
                      duration: 3000,
                      verticalPosition: 'top',
                    });
                }
              )
      
            //  this.router.navigate(['../'],{relativeTo: this.route});
          }
          // this.router.navigate(['../'],{relativeTo: this.route});
        }

  }

