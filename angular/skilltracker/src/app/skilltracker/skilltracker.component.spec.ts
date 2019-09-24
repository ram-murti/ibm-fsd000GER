import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SkilltrackerComponent } from './skilltracker.component';

describe('SkilltrackerComponent', () => {
  let component: SkilltrackerComponent;
  let fixture: ComponentFixture<SkilltrackerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SkilltrackerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SkilltrackerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
