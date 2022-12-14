import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FooterComponent } from './components/footer/footer.component';
import { SignupComponent } from './pages/patient/signup.component';
import { LoginComponent } from './pages/login/login.component';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import { FormsModule } from '@angular/forms';
import{HttpClientModule} from '@angular/common/http';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import { HomeComponent } from './pages/home/home.component';
import {MatCardModule} from '@angular/material/card';
import{MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import { AdminDashboardComponent } from './pages/admin-dashboard/admin-dashboard.component';
import { HospitalComponent } from './pages/hospital/hospital.component';
import {MatDialogModule} from '@angular/material/dialog';
import { Dialog } from '@angular/cdk/dialog';
import { AllergyComponent } from './pages/allergy/allergy.component';
import { DoctorComponent } from './pages/doctor/doctor.component';
import { AddDoctorComponent } from './pages/doctor/add-doctor/add-doctor.component';
import { AddHospitalComponent } from './pages/hospital/add-hospital/add-hospital.component';
import { DiseaseComponent } from './pages/disease/disease.component';
import { AddDiseaseComponent } from './pages/disease/add-disease/add-disease.component';
import { MedicineComponent } from './pages/medicine/medicine.component';
import { AddMedicineComponent } from './pages/medicine/add-medicine/add-medicine.component';
import { RoomTypeComponent } from './pages/room-type/room-type.component';
import { AddRoomTypeComponent } from './pages/room-type/add-room-type/add-room-type.component';
import { AddAllergyComponent } from './pages/allergy/add-allergy/add-allergy.component';
import { RegisterComponent } from './pages/register/register.component';
import { PatientDiseasehistoryComponent } from './pages/patient-diseasehistory/patient-diseasehistory.component';
import { PatientmedicnehitoryComponent } from './pages/patientmedicnehitory/patientmedicnehitory.component';
import { PatienthospitalhistoryComponent } from './pages/patienthospitalhistory/patienthospitalhistory.component';
import { PatientallergyhistoryComponent } from './pages/patientallergyhistory/patientallergyhistory.component';
import { PatienthistoryComponent } from './pages/patienthistory/patienthistory.component';
import { PatientDoctorComponent } from './pages/patient-doctor/patient-doctor.component';
import { UserDashboardComponent } from './pages/user-dashboard/user-dashboard.component';
import { EditUserComponent } from './pages/user-dashboard/edit-user/edit-user.component';
import { UserstatusComponent } from './pages/user-dashboard/userstatus/userstatus.component';
import {MatListModule} from '@angular/material/list';
import { SidenavComponent } from './pages/navbar/sidenav/sidenav.component';
import {MatSidenavModule} from '@angular/material/sidenav';



@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    SignupComponent,
    LoginComponent,
    HomeComponent,
    AdminDashboardComponent,
    HospitalComponent,
    AllergyComponent,
    DoctorComponent,
    AddDoctorComponent,
    AddHospitalComponent,
    DiseaseComponent,
    AddDiseaseComponent,
    MedicineComponent,
    AddMedicineComponent,
    RoomTypeComponent,
    AddRoomTypeComponent,
    AddAllergyComponent,
    RegisterComponent,
    PatientDiseasehistoryComponent,
    PatientmedicnehitoryComponent,
    PatienthospitalhistoryComponent,
    PatientallergyhistoryComponent,
    PatienthistoryComponent,
    PatientDoctorComponent,
    UserDashboardComponent,
    EditUserComponent,
    UserstatusComponent,
    SidenavComponent, 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatInputModule,
    MatFormFieldModule,
    FormsModule,

    HttpClientModule,
    MatSnackBarModule,
   MatCardModule,
   MatToolbarModule,
   MatIconModule,
   MatListModule,
   MatSidenavModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
