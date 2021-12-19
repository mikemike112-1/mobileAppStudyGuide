package edu.towson.cosc435.mhonda.finalstudyguide.ui.pagetwo

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import edu.towson.cosc435.mhonda.finalstudyguide.model.ObjectOne

class PageTwoViewModel: ViewModel() {
    private val privateName: MutableState<String> = mutableStateOf("")
    val name: State<String> = privateName

    fun setName(name: String){
        privateName.value = name
    }

    fun validate(): ObjectOne {
        if(name.value.isEmpty()){
            throw Exception("error: name is empty")
        }
        return ObjectOne(name.value)
    }
}