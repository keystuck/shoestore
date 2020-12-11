package com.example.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeViewModel: ViewModel() {
    private lateinit var _shoes: MutableLiveData<MutableList<Shoe>>

    val shoes: LiveData<MutableList<Shoe>>
            get() = _shoes

    fun addShoe(shoe: Shoe){
        _shoes.value?.add(shoe)
    }

}