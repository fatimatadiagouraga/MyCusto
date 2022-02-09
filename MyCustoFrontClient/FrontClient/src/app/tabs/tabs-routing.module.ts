import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { TabsPage } from './tabs.page';

const routes: Routes = [
  {
    path: 'tabs',
    component: TabsPage,
    children: [
          {
            path: 'accueil',
            loadChildren:() => import('../accueil/accueil.module').then( m => m.AccueilPageModule)
          },
          {
            path: 'categorie',
            loadChildren:() => import('../categorie/categorie.module').then( m => m.CategoriePageModule)
          },
          {
            path: 'panier',
            loadChildren:() => import('../panier/panier.module').then( m => m.PanierPageModule)
          },
          {
            path: 'profil',
            loadChildren:() => import('../profil/profil.module').then( m => m.ProfilPageModule)
          }
        ]
      },
      {
        path: '',
        redirectTo: '/app/tabs/accueil',
        pathMatch: 'full'
      }
];
@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class TabsPageRoutingModule {}
