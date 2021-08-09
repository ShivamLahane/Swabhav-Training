import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NumApiComponent } from './num-api.component';

describe('NumApiComponent', () => {
  let component: NumApiComponent;
  let fixture: ComponentFixture<NumApiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NumApiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NumApiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
