package com.example.shoestore.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Shoe(var name: String, var size: Double, var company: String, var description: String,
                val images: List<String> = mutableListOf()) : Parcelable{
    fun getImagesText():String{
        var ImagesText = ""
        for (image in images){
            ImagesText += "$image, "
        }
        if (ImagesText.length > 2)
            ImagesText = ImagesText.substring(0, ImagesText.length - 2)
        return ImagesText
    }
}