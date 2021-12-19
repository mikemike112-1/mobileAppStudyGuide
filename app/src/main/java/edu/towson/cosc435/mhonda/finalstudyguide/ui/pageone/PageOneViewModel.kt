package edu.towson.cosc435.mhonda.finalstudyguide.ui.pageone

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import edu.towson.cosc435.mhonda.finalstudyguide.data.IMyObjectRepository
import edu.towson.cosc435.mhonda.finalstudyguide.data.impl.MyObjectMemoryRepository
import kotlinx.coroutines.launch
import edu.towson.cosc435.mhonda.finalstudyguide.data.impl.ObjectsDatabaseRepository
import edu.towson.cosc435.mhonda.finalstudyguide.model.MyObject


class PageOneViewModel: ViewModel() {
    private val privateName:MutableState<String> = mutableStateOf("")
    val name: State<String> = privateName

    private val privateMyObjects: MutableState<List<MyObject>> = mutableStateOf(listOf())
    val myObjects : State<List<MyObject>> = privateMyObjects

    private val privateRepository: IMyObjectRepository = MyObjectMemoryRepository()

    init {
        viewModelScope.launch{
            privateMyObjects.value = privateRepository.getObjects()
        }
    }

    fun setName(name: String){
        privateName.value = name
    }

    fun addObject(myObject: MyObject){
        viewModelScope.launch {
            privateRepository.addObject(myObject)
        }
    }

    /*fun getMyObjects(){
        viewModelScope.launch {
            myObjects.value = privateRepository.getObjects()
        }
    }
     */

    fun validate(): MyObject {
        if(name.value.isEmpty()){
            throw Exception("error: name is empty")
        }
        return MyObject(0, name.value)
    }
}