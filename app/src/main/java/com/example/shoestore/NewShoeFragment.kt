package com.example.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import kotlinx.android.synthetic.main.fragment_new_shoe.view.*


class NewShoeFragment : Fragment() {


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
        view.btn_save_new_shoe.setOnClickListener(
                //TODO: save new shoe
                Navigation.createNavigateOnClickListener(R.id.action_newShoeFragment_to_shoesFragment)
        )
        return view
    }
}