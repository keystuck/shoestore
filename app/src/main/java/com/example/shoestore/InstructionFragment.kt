package com.example.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionBinding


/**
 * A simple [Fragment] subclass.
 * Use the [InstructionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InstructionFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
      val binding: FragmentInstructionBinding = DataBindingUtil.inflate(inflater,
          R.layout.fragment_instruction, container, false)

        binding.btnToShoes.setOnClickListener(
        Navigation.createNavigateOnClickListener(R.id.action_instructionFragment_to_shoesFragment)
        )
        return binding.root
    }

}