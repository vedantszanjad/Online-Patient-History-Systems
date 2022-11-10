import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import { DiseaseTsService } from 'src/app/services/disease.ts.service';
import Swal from 'sweetalert2';
import { DiseaseComponent } from '../disease.component';

@Component({
  selector: 'app-add-disease',
  templateUrl: './add-disease.component.html',
  styleUrls: ['./add-disease.component.css']
})
export class AddDiseaseComponent implements OnInit {

  id: number = 0;
  constructor(private DiseaseTsService: DiseaseTsService,
    private snack: MatSnackBar,
    private router: Router,
    public route: ActivatedRoute) { }


  public disease =
    {
      diseaseId: '',
      diseaseName: ''
    }

  ngOnInit(): void {
    this.id = this.route.snapshot.params["id"];
    console.log("router param id is :: " + this.id);
    if (this.id > 0) {

      this.DiseaseTsService.findDiseaseById(this.id)
        .subscribe(
          (data: any) => {
            console.log('data is renderd', data)
            this.disease = data
            console.log(this.disease, 'assigned data to doc')

          },
          (error) => {
            console.log(error)

          }
        );
    }
  }
  formSubmit() {

    if (this.disease.diseaseId === '') {
      this.DiseaseTsService.addDisease(this.disease).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('success Done!!', 'user Id is ' + this.disease.diseaseId, 'success')
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

      this.DiseaseTsService.updateDisease(this.disease).subscribe
        (
          (data: any) => {
            console.log(data)
            Swal.fire('doctor updated sucessfully!!', 'doctor. Id is ' + this.disease.diseaseId, 'success')
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

       this.router.navigate(['../'],{relativeTo: this.route});
    }

  }
  // this.router.navigate(['../'],{relativeTo: this.route});

}




