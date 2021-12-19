package edu.towson.cosc435.mhonda.finalstudyguide.ui.nav

sealed class Routes(val route: String) {
    object MyObjectInfo : Routes("myobjectinfo")
    object YourObjectInfo : Routes("yourobjectinfo")
}
