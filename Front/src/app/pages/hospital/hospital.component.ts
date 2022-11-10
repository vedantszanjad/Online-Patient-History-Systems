import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { HospitalService } from 'src/app/services/hospital.service';
import { Hospital } from 'src/app/model/Hospital';

@Component({
  selector: 'app-hospital',
  templateUrl: './hospital.component.html',
  styleUrls: ['./hospital.component.css']
})
export class HospitalComponent implements OnInit {

  hospitals : Hospital[]
  constructor(private HospitalService : HospitalService,private snack : MatSnackBar,private router:Router) { }
  ngOnInit(): void {

    this.HospitalService.getAllHospitalList()
    .subscribe({
      next:(data) => {
        this.hospitals=data;
        console.log(this.hospitals);
      }
    });
  }

  delete(hospitalId:number)
  {
   console.log(hospitalId);
   this.HospitalService.delete(hospitalId)
   .subscribe({
    next:(data) => {
      // this.doctors=data;
      console.log(this.hospitals);
    }
  });

}
}