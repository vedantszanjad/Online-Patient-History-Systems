import { Component, OnInit } from '@angular/core';
import { Admin } from 'src/app/model/admin';
import { AdminService } from 'src/app/services/admin.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private AdminService :AdminService) { }

  admin:Admin[];

  ngOnInit(): void {
    this.AdminService.getAdminList().subscribe
    (
      {
          next:(data) =>
          {
            this.admin = data;
            console.log(this.admin); 
          }
    });
  }


//   deleteAllergy(adminId:number)
//   {
//    console.log(adminId);
//    this.AdminService.deleteAdmin(adminId)
//    .subscribe({
//     next:(data) => {
//       // this.doctors=data;
//       // console.log(this.allergy);
//     }
//   });
//  }

}
