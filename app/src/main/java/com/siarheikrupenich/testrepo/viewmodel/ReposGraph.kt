package com.siarheikrupenich.testrepo.viewmodel

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.siarheikrupenich.testrepo.presentation.main.ui.ReposScreen
import com.siarheikrupenich.testrepo.viewmodel.RepoGraphDestinations.HOME

@Composable
fun ReposGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController, startDestination = HOME) {
        composable(HOME) { ReposScreen() }
    }
}

internal object RepoGraphDestinations {
    internal const val HOME = "home"
}
