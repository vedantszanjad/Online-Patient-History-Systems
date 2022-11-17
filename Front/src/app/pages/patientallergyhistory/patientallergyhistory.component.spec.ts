import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PatientallergyhistoryComponent } from './patientallergyhistory.component';

describe('PatientallergyhistoryComponent', () => {
  let component: PatientallergyhistoryComponent;
  let fixture: ComponentFixture<PatientallergyhistoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PatientallergyhistoryComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PatientallergyhistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
