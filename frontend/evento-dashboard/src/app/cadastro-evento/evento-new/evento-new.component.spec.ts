import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventoNewComponent } from './evento-new.component';

describe('EventoNewComponent', () => {
  let component: EventoNewComponent;
  let fixture: ComponentFixture<EventoNewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EventoNewComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EventoNewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
