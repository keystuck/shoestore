package com.example.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.shoestore.models.Shoe
import com.example.shoestore.databinding.FragmentNewShoeBinding
import com.example.shoestore.models.ShoeListViewModel


class  NewShoeFragment : Fragment() {

    private val shoeListModel: ShoeListViewModel by activityViewModels()
    private var shoe = Shoe("", 0.0, "", "", listOf<String>())
    private lateinit var binding: FragmentNewShoeBinding




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_new_shoe, container, false)
        binding.shoeList = shoeListModel
        binding.shoe = shoe
        binding.btnCancel.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_newShoeFragment_to_shoesFragment)
        )
//        binding.btnSaveNewShoe.setOnClickListener(View.OnClickListener {
//            saveNewShoe()
//            val navController = Navigation.findNavController(binding.root)
//            navController.navigate(R.id.action_newShoeFragment_to_shoesFragment)
//            }
//        )

        return binding.root
    }

//    fun saveNewShoe(view: View){
//        if (!binding.editShoeName.text.isEmpty()){
//
//            var shoesImages = ArrayList<String>()
//            if (!binding.editShoeSize.text.isEmpty())
//                binding.shoe!!.size = binding.editShoeSize.text.toString().toDouble()
//
//            if (!binding.editImages.text.isEmpty()) {
//                shoesImages.add(binding.editImages.text.toString())
//                binding.shoe!!.images = shoesImages
//            }
//            binding.shoeList!!.addShoe(binding.shoe!!)
//
//            val navController = Navigation.findNavController(binding.root)
//            navController.navigate(R.id.action_newShoeFragment_to_shoesFragment)
//
//        } else {
//            Toast.makeText(context, "No shoe name given", Toast.LENGTH_SHORT).show()
//            Log.i("NewShoeFragment", "should be toasting")
//        }
//    }
}