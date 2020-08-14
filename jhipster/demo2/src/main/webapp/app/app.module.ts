import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { Demo2SharedModule } from 'app/shared/shared.module';
import { Demo2CoreModule } from 'app/core/core.module';
import { Demo2AppRoutingModule } from './app-routing.module';
import { Demo2HomeModule } from './home/home.module';
import { Demo2EntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ActiveMenuDirective } from './layouts/navbar/active-menu.directive';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    Demo2SharedModule,
    Demo2CoreModule,
    Demo2HomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    Demo2EntityModule,
    Demo2AppRoutingModule,
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, ActiveMenuDirective, FooterComponent],
  bootstrap: [MainComponent],
})
export class Demo2AppModule {}
