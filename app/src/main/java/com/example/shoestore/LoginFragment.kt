package com.example.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.shoestore.R
import com.example.shoestore.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false)

        binding.buttonNewLogin.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment2_to_welcomeFragment)
        )


        binding.buttonExistingUser.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment2_to_welcomeFragment)
        )

        return binding.root
    }

}