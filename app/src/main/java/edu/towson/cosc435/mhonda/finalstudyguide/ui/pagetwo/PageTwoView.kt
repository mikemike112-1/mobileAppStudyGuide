package edu.towson.cosc435.mhonda.finalstudyguide.ui.pagetwo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import edu.towson.cosc435.mhonda.finalstudyguide.ui.nav.Routes
import edu.towson.cosc435.mhonda.finalstudyguide.ui.pageone.PageOneViewModel

@Composable
fun PageTwoView(
    vm: PageTwoViewModel = viewModel()
){

    Column (
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Text(
            text = "plain static text here"
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
    }
}