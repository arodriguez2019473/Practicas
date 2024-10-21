import { Routes,RouterModule } from '@angular/router';
import { DetailsComponent } from './pages/details/details.component';
import { AppComponent } from './app.component';
import { Component, NgModule } from '@angular/core';
import { HomeComponent } from './pages/home/home.component';
import { PrincipalComponent } from './pages/principal/principal.component';


export const routes: Routes = [

    {
        path:'pokemones',
        component:HomeComponent
    },

    {
        path: 'details/:name',
        component: DetailsComponent
    },
    
    {
        path: '',
        component: PrincipalComponent

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