import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import { AdminService } from 'src/app/services/admin.service';
import Swal from 'sweetalert2';
import { AdminComponent } from '../admin.component';

@Component({
  selector: 'app-add-admin',
  templateUrl: './add-admin.component.html',
  styleUrls: ['./add-admin.component.css']
})
export class AddAdminComponent implements OnInit {
  id: number = 0;

  constructor(private AdminService : AdminService, private snack: MatSnackBar,
    private router: Router,
    public route: ActivatedRoute) { }

    
  public admin =
  {
    adminId: '',
    adminName: '',
    userPassword:'',
    adminRole:''
  }

  ngOnInit(): void {
    this.id = this.route.snapshot.params["id"];
    console.log("router param id is :: " + this.id);
    if (this.id > 0) {

      this.AdminService.findAdminById(this.id)
        .subscribe(
          (data: any) => {
            console.log('data is renderd', data)
            this.admin = data
            console.log(this.admin, 'assigned data to doc')

          },
          (error) => {
            console.log(error)

          }
        );
    }
  }
  formSubmit() {

    if (this.admin.adminId === '') {
      this.AdminService.addAdmin(this.admin).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('success Done!!', 'user Id is ' + this.admin.adminId, 'success')
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
      this.AdminService.updateAdmin(this.admin).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('doctor updated sucessfully!!', 'doctor. Id is ' + this.admin.adminId, 'success')
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
  }

}

