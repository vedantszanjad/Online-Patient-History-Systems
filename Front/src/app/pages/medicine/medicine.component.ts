import { Component, OnInit } from '@angular/core';
import { Medicine } from 'src/app/model/Medicine';
import { MedicineService } from 'src/app/services/medicine.service';

@Component({
  selector: 'app-medicine',
  templateUrl: './medicine.component.html',
  styleUrls: ['./medicine.component.css']
})
export class MedicineComponent implements OnInit {

  medicines:Medicine[];
  constructor(private MedicineService :MedicineService) { }

  ngOnInit(): void {

    this.MedicineService.getAllMedicines()
    .subscribe({
      next:(data) => {
        this.medicines=data;
        console.log(this.medicines);
      }
    });
  }

  delete(tabletId:number)
  {
   console.log(tabletId);
   this.MedicineService.deleteMedicine(tabletId)
   .subscribe({
    next:(data) => {
      // this.doctors=data;
      console.log(this.medicines);
    }
  });

}

}
