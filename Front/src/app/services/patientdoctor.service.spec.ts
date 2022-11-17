import { TestBed } from '@angular/core/testing';

import { PatientdoctorService } from './patientdoctor.service';

describe('PatientdoctorService', () => {
  let service: PatientdoctorService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PatientdoctorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
