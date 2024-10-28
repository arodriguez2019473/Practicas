import { Routes, RouterModule } from '@angular/router';
import { DetailsComponent } from './pages/details/details.component';
import { AppComponent } from './app.component';
import { Component, NgModule } from '@angular/core';
import { HomeComponent } from './pages/home/home.component';
import { PrincipalComponent } from './pages/principal/principal.component';
import { ConfigComponent } from './pages/config/config.component';
import { MinilistComponent } from './pages/minilist/minilist.component';
import { AgregarComponent } from './pages/agregar/agregar.component';


export const routes: Routes = [

    { path: 'pokemones', component: HomeComponent },
    { path: 'details/:id', component: DetailsComponent },
    { path: 'pokedex', component: HomeComponent },
    { path: '', component: PrincipalComponent },
    { path: 'config', component: ConfigComponent },
    { path: 'list', component: MinilistComponent },
    { path: 'formulario', component: AgregarComponent}

];


@NgModule({
    imports: [
        RouterModule.forRoot(routes),
    ],
    exports: [RouterModule],
    declarations: []
})

export class RouteModule { }