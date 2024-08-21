package com.example.navigationgraphdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationgraphdemo.R
import com.example.navigationgraphdemo.databinding.FragmentProfileBinding
import com.example.navigationgraphdemo.databinding.FragmentSettingsBinding
import com.example.navigationgraphdemo.databinding.FragmentThirdBinding

class MySettingsFragment : Fragment() {

    private lateinit var addNoteBinding: FragmentSettingsBinding
    private val binding get() = addNoteBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        addNoteBinding= FragmentSettingsBinding.inflate(inflater, container, false)
        return addNoteBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       binding.btnGoToBack.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_settings_to_navigation_third)
        }

    }
}