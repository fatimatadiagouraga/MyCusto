import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { PlatDetailsPageRoutingModule } from './plat-details-routing.module';

import { PlatDetailsPage } from './plat-details.page';
import {InputNumberModule} from 'primeng/inputnumber';
@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    PlatDetailsPageRoutingModule,
    InputNumberModule
  ],
  declarations: [PlatDetailsPage]
})
export class PlatDetailsPageModule {

}
