import { Component, OnInit } from '@angular/core';
import { PatientallergyhistoryModule } from 'src/app/model/patientallergyhistory/patientallergyhistory.module';
import { PatientallergyService } from 'src/app/services/patientallergy.service';

@Component({
  selector: 'app-patientallergyhistory',
  templateUrl: './patientallergyhistory.component.html',
  styleUrls: ['./patientallergyhistory.component.css']
})
export class PatientallergyhistoryComponent implements OnInit {

  patientallergy:PatientallergyhistoryModule[];
  constructor(private PatientallergyService:PatientallergyService) { }

  ngOnInit(): void {
    console.log('mapping is running');
  this.PatientallergyService.getAllList().subscribe
  (
    {
      next:(data) =>
      {
        this.patientallergy = data;
        console.log(this.patientallergy);
      }
    });
  }

}
