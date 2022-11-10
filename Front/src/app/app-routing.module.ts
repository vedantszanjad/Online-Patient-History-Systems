import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { SignupComponent } from './pages/signup/signup.component';
import { AdminDashboardComponent } from './pages/admin-dashboard/admin-dashboard.component';
import { HospitalComponent } from './pages/hospital/hospital.component';
import { DoctorComponent } from './pages/doctor/doctor.component';
import { AddDoctorComponent } from './pages/doctor/add-doctor/add-doctor.component';
import { AddHospitalComponent } from './pages/hospital/add-hospital/add-hospital.component';
import { DiseaseComponent } from './pages/disease/disease.component';
import { AddDiseaseComponent } from './pages/disease/add-disease/add-disease.component';
import { MedicineComponent } from './pages/medicine/medicine.component';
import { AddMedicineComponent } from './pages/medicine/add-medicine/add-medicine.component';
import { RoomTypeComponent } from './pages/room-type/room-type.component';
import { AddRoomTypeComponent } from './pages/room-type/add-room-type/add-room-type.component';

const routes: Routes = 
[
  {
    path:'',
    component:HomeComponent,
    pathMatch:'full',
  },

  {
    path :'signup',
    component:SignupComponent,
  },
  {
    path : "login",
    component:LoginComponent,
  },

  {
    path : 'admin',component:AdminDashboardComponent
  },
  {
    path:'admin/hospital',component:HospitalComponent
  },
  {
    path:'hospital',component:HospitalComponent
  },

  {
    path : 'doctor',component:DoctorComponent,
    
  },
  {
    path:'addDoctor',component:AddDoctorComponent
  },

  {
    path:'editDoctor/:id',component:AddDoctorComponent
  },

  {
    path:'getHospitals',component:HospitalComponent
  },
  
  {
    path:'addHospital',component:AddHospitalComponent
  },

  {
    path:'editHospital/:id',component:AddHospitalComponent
  },

  {
    path:'getDisease',component:DiseaseComponent
  },

  {
    path:'addDisease',component:AddDiseaseComponent
  },

  {
    path:'editDisease/:id',component:AddDiseaseComponent
  },

  {
    path:'getMedicines',component:MedicineComponent
  },
  
  {
    path:'addMedicine',component:AddMedicineComponent
  },

  {
    path:'editMedicine/:id',component:AddMedicineComponent
  },

  {
    path:'getRoomtypes',component:RoomTypeComponent
  },
  {
    path:'addRoomtypes',component:AddRoomTypeComponent
  },
  {
    path:'editRoomtype/:id',component:AddRoomTypeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
