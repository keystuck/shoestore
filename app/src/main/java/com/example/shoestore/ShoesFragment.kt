package com.example.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import com.example.shoestore.dummy.DummyContent
import com.udacity.shoestore.models.Shoe
import kotlinx.android.synthetic.main.fragment_shoe_list.view.*

/**
 * A fragment representing a list of Items.
 */
class ShoesFragment : Fragment() {

    private val shoesList = listOf(
            Shoe("Clog", 8.5, "Fluevog", "Pretty"),
            Shoe("Stiletto", 9.0, "Louboutin", "Painful"),
            Shoe("Wellie", 7.0, "Wellington", "Sloshy but dry")
    )

    private var columnCount = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_shoe_list, container, false)
        view.fab_new_shoe.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_shoesFragment_to_newShoeFragment)
        )
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.list.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = MyShoesRecyclerViewAdapter(shoesList)
        }
    }
}