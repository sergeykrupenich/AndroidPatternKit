package com.siarheikrupenich.testrepo.viewmodel

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.siarheikrupenich.testrepo.presentation.main.ui.ReposScreen

@Composable
fun ReposGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            ReposScreen(
                onRepoItemSelected = { id ->
                    navController.navigate(Screen.Details.createRoute(id))
                }
            )
        }

        composable(
            route = Screen.Details.route,
            arguments = listOf(
                navArgument("id") { type = NavType.LongType }
            )
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")!!
            DetailsScreen(id = id)
        }
    }
}

internal sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Details : Screen("details/{id}") {
        fun createRoute(id: Long) = "details/$id"
    }
}
