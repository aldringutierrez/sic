import { TestBed } from '@angular/core/testing';

import { EncuestaServService } from './encuesta-serv.service';

describe('EncuestaServService', () => {
  let service: EncuestaServService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EncuestaServService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
