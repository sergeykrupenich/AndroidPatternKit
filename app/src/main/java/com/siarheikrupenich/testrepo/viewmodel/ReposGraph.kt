package com.siarheikrupenich.testrepo.viewmodel

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.siarheikrupenich.testrepo.presentation.mvi.ReposScreenMvi
import com.siarheikrupenich.testrepo.presentation.mvvm.ReposScreenMvvm
import com.siarheikrupenich.testrepo.viewmodel.TestRepoGraphDestinations.HOME_MVI
import com.siarheikrupenich.testrepo.viewmodel.TestRepoGraphDestinations.HOME_MVVM

@Composable
fun ReposGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController, startDestination = HOME_MVVM) {
        composable(HOME_MVVM) { ReposScreenMvvm() }
        composable(HOME_MVI) { ReposScreenMvi() }
    }
}

internal object TestRepoGraphDestinations {
    internal const val HOME_MVVM = "home_mvvm"
    internal const val HOME_MVI = "home_mvi"
}
