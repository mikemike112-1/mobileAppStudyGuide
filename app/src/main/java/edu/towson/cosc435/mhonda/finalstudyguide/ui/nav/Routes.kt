package edu.towson.cosc435.mhonda.finalstudyguide.ui.nav

sealed class Routes(val route: String) {
    object ObjectOneInfo : Routes("objectoneinfo")
    object ObjectTwoInfo : Routes("objecttwoinfo")
}
