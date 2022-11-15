import { Component, OnInit } from '@angular/core';
import { Allergy } from 'src/app/model/Allergy';
import { AllergyService } from 'src/app/services/allergy.service';

@Component({
  selector: 'app-allergy',
  templateUrl: './allergy.component.html',
  styleUrls: ['./allergy.component.css']
})
export class AllergyComponent implements OnInit {

  constructor(private AllergyService: AllergyService) { }

  allergy:Allergy[];

  deleteMessage:any;

  ngOnInit(): void {
    this.AllergyService.getAllAllergyList().subscribe
    (
      {
          next:(data) =>
          {
            this.allergy = data;
            console.log(this.allergy);
          }
    });
    
  }
  deleteAllergy(aId:number)
  {
   console.log(aId);
   this.AllergyService.deleteAllergy(aId)
   .subscribe({
    next:(data) => {
       this.deleteAllergy=data;
      console.log(this.deleteAllergy);
    }
  });
 }

}
