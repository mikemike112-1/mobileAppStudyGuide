package edu.towson.cosc435.mhonda.finalstudyguide.ui.pageone

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import edu.towson.cosc435.mhonda.finalstudyguide.ui.pageone.PageOneViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PageOneView(
    vm: PageOneViewModel = viewModel()
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