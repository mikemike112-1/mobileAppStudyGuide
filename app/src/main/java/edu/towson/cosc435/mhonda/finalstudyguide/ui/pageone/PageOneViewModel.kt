package edu.towson.cosc435.mhonda.finalstudyguide.ui.pageone

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.towson.cosc435.mhonda.finalstudyguide.data.IObjectOneRepository
import edu.towson.cosc435.mhonda.finalstudyguide.data.impl.ObjectOneMemoryRepository
import edu.towson.cosc435.mhonda.finalstudyguide.model.ObjectOne
import kotlinx.coroutines.launch
import edu.towson.cosc435.mhonda.finalstudyguide.data.impl.ObjectsDatabaseRepository


class PageOneViewModel: ViewModel() {
    private val privateName:MutableState<String> = mutableStateOf("")
    val name: State<String> = privateName

    private val privateObjectOnes: MutableState<List<ObjectOne>> = mutableStateOf(listOf())
    val objectOnes : State<List<ObjectOne>> = privateObjectOnes

    private val privateRepository: IObjectOneRepository = ObjectOneMemoryRepository()


    init {
        viewModelScope.launch{
            privateObjectOnes.value = privateRepository.getObjects()
        }
    }

    fun setName(name: String){
        privateName.value = name
    }

    fun getObjectOnes(){
        return
    }

    fun validate(): ObjectOne {
        if(name.value.isEmpty()){
            throw Exception("error: name is empty")
        }
        return ObjectOne(name.value)
    }
}