import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MinilistComponent } from './minilist.component';

describe('MinilistComponent', () => {
  let component: MinilistComponent;
  let fixture: ComponentFixture<MinilistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MinilistComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MinilistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
