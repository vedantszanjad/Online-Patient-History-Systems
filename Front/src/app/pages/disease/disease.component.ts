import { Component, OnInit } from '@angular/core';
import { Disease } from 'src/app/model/Disease';
import { DiseaseTsService } from 'src/app/services/disease.ts.service';
import { DoctorService } from 'src/app/services/doctor.service';

@Component({
  selector: 'app-disease',
  templateUrl: './disease.component.html',
  styleUrls: ['./disease.component.css']
})
export class DiseaseComponent implements OnInit {

  diseases: Disease[];
  constructor(private DiseaseTsService : DiseaseTsService) { }


  ngOnInit(): void {

    this.DiseaseTsService.getAllDiseaseList()
    .subscribe({
      next:(data) => {
        this.diseases=data;
        console.log(this.diseases);
      }
    });
  }

  deleteDisease(diseaseId:number)
  {
   console.log(diseaseId);
   this.DiseaseTsService.deleteDisease(diseaseId)
   .subscribe({
    next:(data) => {
      // this.doctors=data;
      console.log(this.diseases);
    }
  });
 }

}
