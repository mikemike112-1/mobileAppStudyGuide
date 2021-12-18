package edu.towson.cosc435.mhonda.finalstudyguide.ui.nav

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.towson.cosc435.mhonda.finalstudyguide.ui.pageone.PageOneView
import edu.towson.cosc435.mhonda.finalstudyguide.ui.pageone.PageOneViewModel

@Composable
fun ObjectsNavGraph(
    navController: NavHostController = rememberNavController()
){
    val vm: PageOneViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Routes.ObjectOneInfo.route
    ){
        composable(Routes.ObjectOneInfo.route){
            //PageOneScreen(vm)
        }

    }
}