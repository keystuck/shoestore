package com.example.shoestore

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoestore.models.Shoe

class ShoeViewModel: ViewModel() {
    private var _shoes: MutableLiveData<MutableList<Shoe>> = MutableLiveData(mutableListOf<Shoe>())

    val shoes: LiveData<MutableList<Shoe>>
            get() = _shoes

    fun addShoe(shoe: Shoe){
        _shoes.value?.add(shoe)
    }

}