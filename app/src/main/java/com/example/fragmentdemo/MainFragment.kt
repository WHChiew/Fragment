package com.example.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fragmentdemo.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

         binding = DataBindingUtil.inflate(inflater , R.layout.fragment_main, container, false)
       binding.btnShowAbout.setOnClickListener() {
           Navigation.findNavController(binding.root).navigate(R.id.action_mainFragment_to_aboutFragment)
       }
        return binding.root
    }

}