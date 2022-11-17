import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { SignupComponent } from './pages/patient/signup.component';
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
import { Allergy } from './model/Allergy';
import { AllergyComponent } from './pages/allergy/allergy.component';
import { AddAllergyComponent } from './pages/allergy/add-allergy/add-allergy.component';
import { PatientRegistration } from './model/patient-registration';
import { RegisterComponent } from './pages/register/register.component';
import { PatientDiseasehistoryComponent } from './pages/patient-diseasehistory/patient-diseasehistory.component';
import { PatientmedicnehitoryComponent } from './pages/patientmedicnehitory/patientmedicnehitory.component';
import { PatienthospitalService } from './services/patienthospital.service';
import { PatientallergyhistoryComponent } from './pages/patientallergyhistory/patientallergyhistory.component';
import { PatienthospitalhistoryComponent } from './pages/patienthospitalhistory/patienthospitalhistory.component';
import { PatienthistoryComponent } from './pages/patienthistory/patienthistory.component';
import { PatientDoctorComponent } from './pages/patient-doctor/patient-doctor.component';
import { UserDashboardComponent } from './pages/user-dashboard/user-dashboard.component';
import { EditUserComponent } from './pages/user-dashboard/edit-user/edit-user.component';
import { UserstatusComponent } from './pages/user-dashboard/userstatus/userstatus.component';
import { NavbarComponent } from './components/navbar/navbar.component';

const routes: Routes =
  [
    {
      path: '',
      component: HomeComponent,
      pathMatch: 'full',
    },

    // {
    //   path: 'signup',
    //   component: SignupComponent,
    // },
    {
      path: "login",
      component: LoginComponent,
    },

    {
      path: 'admin', component: AdminDashboardComponent
    },
    {
      path: 'admin/hospital', component: HospitalComponent
    },
    {
      path: 'hospital', component: HospitalComponent
    },

    {
      path: 'doctor', component: DoctorComponent,

    },
    {
      path: 'addDoctor', component: AddDoctorComponent
    },

    {
      path: 'editDoctor/:id', component: AddDoctorComponent
    },

    {
      path: 'getHospitals', component: HospitalComponent
    },

    {
      path: 'addHospital', component: AddHospitalComponent
    },

    {
      path: 'editHospital/:id', component: AddHospitalComponent
    },

    {
      path: 'getDisease', component: DiseaseComponent
    },

    {
      path: 'addDisease', component: AddDiseaseComponent
    },

    {
      path: 'editDisease/:id', component: AddDiseaseComponent
    },

    {
      path: 'getMedicines', component: MedicineComponent
    },

    {
      path: 'addMedicine', component: AddMedicineComponent
    },

    {
      path: 'editMedicine/:id', component: AddMedicineComponent
    },

    {
      path: 'getRoomtypes', component: RoomTypeComponent
    },
    {
      path: 'addRoomtypes', component: AddRoomTypeComponent
    },
    {
      path: 'editRoomtype/:id', component: AddRoomTypeComponent
    },
    {
      path: 'getAllergy', component: AllergyComponent
    },
    {
      path: 'addAllergy', component: AddAllergyComponent
    },
    {
      path:'editAllergy/:id',component:AddAllergyComponent
    },
    {
      path: 'getPatientList', component: SignupComponent
    },
    {
      path:'addPatient',component : RegisterComponent
    },
    {
      path:'getPdHistory',component:PatientDiseasehistoryComponent
    },
    {
      path:'getPmHistory',component:PatientmedicnehitoryComponent
    },
    {
      path:'getPhHistory',component:PatienthospitalhistoryComponent
    },
    {
      path:'getpaHistory',component:PatientallergyhistoryComponent
    },
    {
      path:'getAllPatientHistory',component:PatienthistoryComponent
    },
    {
      path:'getAllPatientDoctorVisit',component:PatientDoctorComponent
    },
    {
      path:'user',component:UserDashboardComponent
    },
    {
      path:"editUser/:id",component:EditUserComponent
    },
    {
      path:'userStatus',component:UserstatusComponent
    }
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
