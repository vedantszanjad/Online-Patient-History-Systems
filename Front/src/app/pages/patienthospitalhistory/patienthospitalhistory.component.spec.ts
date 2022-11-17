import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PatienthospitalhistoryComponent } from './patienthospitalhistory.component';

describe('PatienthospitalhistoryComponent', () => {
  let component: PatienthospitalhistoryComponent;
  let fixture: ComponentFixture<PatienthospitalhistoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PatienthospitalhistoryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PatienthospitalhistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
