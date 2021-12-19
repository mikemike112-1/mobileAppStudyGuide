package edu.towson.cosc435.mhonda.finalstudyguide.ui.pagetwo

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import edu.towson.cosc435.mhonda.finalstudyguide.model.ObjectOne

class PageTwoViewModel: ViewModel() {
    private val privateName: MutableState<String> = mutableStateOf("")
    val name: State<String> = privateName

    private val privateId: MutableState<Int> = mutableStateOf(0)
    val id: State<Int> = privateId

    fun setName(name: String){
        privateName.value = name
    }

    fun setId(id: Int){
        privateId.value = id
    }

    fun validate(): ObjectOne {
        if(name.value.isEmpty()){
            throw Exception("error: name is empty")
        }

        //do i need to check the id value here?

        return ObjectOne(id.value, name.value)
    }
}