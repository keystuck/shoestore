package com.example.shoestore

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.shoestore.models.Shoe
import com.example.shoestore.R
import kotlinx.android.synthetic.main.fragment_new_shoe.view.*


class  NewShoeFragment : Fragment() {

    private val shoeModel: ShoeViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_new_shoe, container, false)
        view.btn_cancel.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_newShoeFragment_to_shoesFragment)
        )
        view.btn_save_new_shoe.setOnClickListener(View.OnClickListener {
            saveNewShoe(view)
            }
        )
        return view
    }

    fun saveNewShoe(view: View){
        if (!view.edit_shoe_name.text.isEmpty()){
            val shoeName = view.edit_shoe_name.text.toString()
            var shoeSize = 0.0
            var shoeCompany = ""
            var shoeDescription = ""
            var shoesImages = ArrayList<String>()
            if (!view.edit_shoe_size.text.isEmpty())
                shoeSize = view.edit_shoe_size.text.toString().toDouble()
            if (!view.edit_company.text.isEmpty())
                shoeCompany = view.edit_company.text.toString()
            if (!view.edit_description.text.isEmpty())
                shoeDescription = view.edit_description.text.toString()
            if (!view.edit_images.text.isEmpty())
                shoesImages.add(view.edit_images.text.toString())

            shoeModel.addShoe(Shoe(shoeName, shoeSize, shoeCompany, shoeDescription, shoesImages))
            view.findNavController().navigate(R.id.action_newShoeFragment_to_shoesFragment)

        } else {
            Toast.makeText(context, "No shoe name given", Toast.LENGTH_SHORT).show()
        }
    }
}