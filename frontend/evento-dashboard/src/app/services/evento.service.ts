import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { Evento } from '../model/evento.model';
import { environment } from '../../environments/environment';


@Injectable({
  providedIn: 'root'
})
export class EventoService {

  constructor(
    private http: HttpClient
  ) { }

  public findAll(): Observable<Evento[]> {
    return this.http.get<Evento[]>(`${environment.apiUrl}/evento/listar`);
  }
}
