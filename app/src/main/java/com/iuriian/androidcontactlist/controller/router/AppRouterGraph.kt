package com.iuriian.androidcontactlist.controller.router

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.iuriian.androidcontactlist.view.contact.CreateContactScreen
import com.iuriian.androidcontactlist.view.contact.ListContactsScreen

@Composable
fun AppRouterGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.ListContact) {
        composable<Routes.ListContact> {
            ListContactsScreen(
                onCreateButtonClicked = { navController.navigate(Routes.CreateContact) },
            )
        }
        composable<Routes.CreateContact> {
            CreateContactScreen(
                onBack = { navController.popBackStack() },
            )
        }
    }
}
