package edu.towson.cosc435.mhonda.finalstudyguide.ui.pageone

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
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
    val index = 0
    val newName = remember { mutableStateOf("")}
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
            Row(

            ){
                Text(
                    text = vm.name.value
                )
            }


            OutlinedTextField(
                value = newName.value,
                onValueChange = { newName.value = it },
                placeholder = {
                    Text(text = "New name")
                }
            )

            Button(
                onClick = {
                    vm.addObject(MyObject(index, newName.value))
                },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("add object")
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