import { Component, OnInit } from '@angular/core';
import { PatienthospitalhistoryModule } from 'src/app/model/patienthospitalhistory/patienthospitalhistory.module';
import { PatienthospitalService } from 'src/app/services/patienthospital.service';

@Component({
  selector: 'app-patienthospitalhistory',
  templateUrl: './patienthospitalhistory.component.html',
  styleUrls: ['./patienthospitalhistory.component.css']
})
export class PatienthospitalhistoryComponent implements OnInit {

  ph:PatienthospitalhistoryModule[];
  constructor(private PatienthospitalService : PatienthospitalService) { }
  ngOnInit(): void {
    console.log('mapping is running');
    this.PatienthospitalService.getAllList().
    subscribe
    (
      {
        next:(data) =>
        {
          this.ph = data;
          
            console.log(this.ph);
          }
    });
  }
  }
