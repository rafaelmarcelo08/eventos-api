import { Component, OnInit } from '@angular/core';

import { EventoService } from './../../services/evento.service';

@Component({
  selector: 'app-evento-list',
  templateUrl: './evento-list.component.html',
  styleUrls: ['./evento-list.component.css']
})
export class EventoListComponent implements OnInit {

  constructor(
    private eventoService: EventoService
  ) { }

  ngOnInit(): void {
    console.log('construido');
    this.eventoService.findAll().subscribe((response) => {
      console.log(response);
    });
  }
}
