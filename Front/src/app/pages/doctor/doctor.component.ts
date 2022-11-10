import { Component, OnInit } from '@angular/core';
import { first } from 'rxjs';
import { Doctor } from 'src/app/model/Doctor';
import { DoctorService } from 'src/app/services/doctor.service';

@Component({
  selector: 'app-doctor',
  templateUrl: './doctor.component.html',
  styleUrls: ['./doctor.component.css']
})
export class DoctorComponent implements OnInit {
  doctors:Doctor[];

  constructor(private doctorService:DoctorService) { }

  ngOnInit(): void {

    this.doctorService.getAllDoctor()
    .subscribe({
      next:(data) => {
        this.doctors=data;
        console.log(this.doctors);
      }
    });
  }

  deleteDoctor(doctorId:number)
  {
   console.log(doctorId);
   this.doctorService.deleteDoctor(doctorId)
   .subscribe({
    next:(data) => {
      // this.doctors=data;
      console.log(this.doctors);
    }
  });
 }

 
}