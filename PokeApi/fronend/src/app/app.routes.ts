import { Routes,RouterModule } from '@angular/router';
import { DetailsComponent } from './pages/details/details.component';
import { AppComponent } from './app.component';
import { Component, NgModule } from '@angular/core';
import { HomeComponent } from './pages/home/home.component';


export const routes: Routes = [

    {
        path:'principal',
        component:HomeComponent
    },

    {
        path: 'details/:name',
        component: DetailsComponent
    }
    

];


@NgModule({
    imports: [
        RouterModule.forRoot(routes),
    ],
    exports: [RouterModule],
    declarations: []
})

export class RouteModule { }