package edu.towson.cosc435.mhonda.finalstudyguide.ui.pageone

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import edu.towson.cosc435.mhonda.finalstudyguide.data.impl.MyObjectMemoryRepository
import edu.towson.cosc435.mhonda.finalstudyguide.model.MyObject
import edu.towson.cosc435.mhonda.finalstudyguide.ui.MyObjectsRow
import edu.towson.cosc435.mhonda.finalstudyguide.ui.nav.Routes

@Composable
fun PageOneView(
    myObjects: List<MyObject>,
    vm: PageOneViewModel = viewModel(),
    nav: NavHostController,
    onAddObject: (MyObject) -> Unit
) {

    //val myObjects by vm.myObjects

    Column(

    ) {

        Box(

        ) {

            val objects = (0..5).map { i ->
                MyObject(i, "theName$i")
            }



//            launch.scope {
//                val obs = mem.getObjects()
//            }



            LazyColumn {
                itemsIndexed(myObjects) { idx, myObject ->
                    MyObjectsRow( myObject)
                }
            }
        }


        //----------------------

        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "page one view"
            )
            Text(
                text = vm.name.value
            )

            OutlinedTextField(
                value = vm.name.value,
                onValueChange = vm::setName,
                placeholder = {
                    Text(text = "name placeholder")
                }
            )
            Button(
                onClick = {
                    nav.navigate(Routes.YourObjectInfo.route) {
                        popUpTo(Routes.YourObjectInfo.route)
                    }
                },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("go to page two")
            }
            Button(
                onClick = {
                          try {
                              val myObject = vm.validate()
                              onAddObject(myObject)
                          } catch (e: Exception){
                              //toast?
                          }

                    //nav.navigate(Routes.YourObjectInfo.route) {
                    //    popUpTo(Routes.YourObjectInfo.route)
                    //}
                },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("go to page two")
            }

        }
    }
}