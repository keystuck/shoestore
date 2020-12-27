package com.example.shoestore

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.shoestore.databinding.FragmentShoeBinding
import com.example.shoestore.databinding.FragmentShoeListBinding
import com.example.shoestore.models.Shoe
import kotlinx.android.synthetic.main.fragment_shoe_list.view.*


class ShoesFragment : Fragment() {

    private var shoesList = listOf<Shoe>(

    )

    private val shoeModel: ShoeViewModel by activityViewModels()

    private lateinit var binding: FragmentShoeListBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
       binding = DataBindingUtil.inflate(
           inflater, R.layout.fragment_shoe_list, container, false
       )
        binding.shoeViewModel = shoeModel

        binding.fabNewShoe.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_shoesFragment_to_newShoeFragment)
        )
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
            super.onCreateOptionsMenu(menu, inflater)
            inflater.inflate(R.menu.logout_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.loginFragment2){

            return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
        }

         return super.onOptionsItemSelected(item)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        shoeModel.shoes.observe(viewLifecycleOwner, Observer { newList ->
            shoesList = newList.toList()
            for (shoe in shoesList){

                val newView = DataBindingUtil.inflate<FragmentShoeBinding>(layoutInflater, R.layout.fragment_shoe, view.shoesList, true)
                newView.shoe = shoe


            }


        })

    }
}