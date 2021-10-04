package com.xpandeyed.mvvmandlivedata


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MyViewModel : ViewModel() {
    private var myList = mutableListOf<String>()
    val myLiveData = MutableLiveData<MutableList<String>>()
    fun addData()
    {
        CoroutineScope(Dispatchers.Main).launch {
            //Let is pretent to do some work
            delay(10000)
            myList.add("Word 1")
            myLiveData.value = myList

        }

    }
}