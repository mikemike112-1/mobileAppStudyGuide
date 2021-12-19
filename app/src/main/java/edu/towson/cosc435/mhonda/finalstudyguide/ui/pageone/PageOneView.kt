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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import edu.towson.cosc435.mhonda.finalstudyguide.ui.pageone.PageOneViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import edu.towson.cosc435.mhonda.finalstudyguide.model.ObjectOne
import edu.towson.cosc435.mhonda.finalstudyguide.ui.ObjectOnesRow
import edu.towson.cosc435.mhonda.finalstudyguide.ui.nav.Routes

@Composable
fun PageOneView(
    vm: PageOneViewModel = viewModel(),
    nav: NavHostController,

) {

    Column(

    ) {

        Box(

        ) {
            val objects = (0..5).map { i ->
                ObjectOne(i, "theName$i")
            }
            LazyColumn {
                itemsIndexed(objects) { idx, objectOne ->
                    ObjectOnesRow( objectOne)
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
                    nav.navigate(Routes.ObjectTwoInfo.route) {
                        popUpTo(Routes.ObjectTwoInfo.route)
                    }
                },
                modifier = Modifier.padding(16.dp)
            ) {
                Text("go to page two")
            }
        }
    }
}