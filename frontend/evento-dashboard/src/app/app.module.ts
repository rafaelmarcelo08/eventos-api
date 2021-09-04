import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EventoListComponent } from './cadastro-evento/evento-list/evento-list.component';
import { EventoNewComponent } from './cadastro-evento/evento-new/evento-new.component';

@NgModule({
  declarations: [
    AppComponent,
    EventoListComponent,
    EventoNewComponent,
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
