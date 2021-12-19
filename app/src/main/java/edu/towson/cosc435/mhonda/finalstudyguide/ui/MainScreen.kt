package edu.towson.cosc435.mhonda.finalstudyguide.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import edu.towson.cosc435.mhonda.finalstudyguide.ui.nav.ObjectsNavGraph

@Composable
fun MainScreen(){
    val nav = rememberNavController()
    Scaffold {
        ObjectsNavGraph(nav)
    }
}
