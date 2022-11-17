import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PatientmedicnehitoryComponent } from './patientmedicnehitory.component';

describe('PatientmedicnehitoryComponent', () => {
  let component: PatientmedicnehitoryComponent;
  let fixture: ComponentFixture<PatientmedicnehitoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PatientmedicnehitoryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PatientmedicnehitoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
