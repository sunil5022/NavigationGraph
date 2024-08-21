package com.example.navigationgraphdemo.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationgraphdemo.R
import com.example.navigationgraphdemo.databinding.FragmentHomeBinding
import com.example.navigationgraphdemo.databinding.FragmentProfileBinding

class MyHomeFragment : Fragment() {

    private lateinit var addNoteBinding: FragmentHomeBinding
    private val binding get() = addNoteBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        addNoteBinding= FragmentHomeBinding.inflate(inflater, container, false)
        return addNoteBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnOpenDialog.setOnClickListener {
            findNavController().navigate(
                R.id.action_navigation_home_to_myDialog)

        }
    }
}