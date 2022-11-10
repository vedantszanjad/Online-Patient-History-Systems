import { TestBed } from '@angular/core/testing';

import { DiseaseTsService } from './disease.ts.service';

describe('DiseaseTsService', () => {
  let service: DiseaseTsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DiseaseTsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
