package edu.towson.cosc435.mhonda.finalstudyguide.ui.pageone

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import edu.towson.cosc435.mhonda.finalstudyguide.model.ObjectOne

class PageOneViewModel: ViewModel() {
    private val private_name:MutableState<String> = mutableStateOf("")
    val name: State<String> = private_name

    fun setName(name: String){
        private_name.value = name
    }

    fun validate(): ObjectOne {
        if(name.value.isEmpty()){
            throw Exception("error: name is empty")
        }
        return ObjectOne(name.value)
    }
}