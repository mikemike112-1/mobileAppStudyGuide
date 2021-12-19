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
import edu.towson.cosc435.mhonda.finalstudyguide.ui.pagetwo.PageTwoView
import edu.towson.cosc435.mhonda.finalstudyguide.ui.pagetwo.PageTwoViewModel

@Composable
fun ObjectsNavGraph(
    navController: NavHostController = rememberNavController()
){
    val vmOne: PageOneViewModel = viewModel()
    val vmTwo: PageTwoViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Routes.ObjectOneInfo.route
    ){
        composable(Routes.ObjectOneInfo.route){
            PageOneScreen(vmOne, navController)
        }
        composable(Routes.ObjectTwoInfo.route){
            PageTwoScreen(vmTwo, navController)
        }
    }
}

@Composable
fun PageOneScreen(
    vm: PageOneViewModel,
    navController: NavHostController,

){
//    objectOnes: List<ObjectOne>

    PageOneView(vm, navController)
}

@Composable
fun PageTwoScreen(
    vm: PageTwoViewModel,
    navController: NavHostController
){
    PageTwoView(vm, navController)
}
