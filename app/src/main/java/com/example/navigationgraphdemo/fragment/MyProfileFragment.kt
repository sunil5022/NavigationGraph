package com.example.navigationgraphdemo.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationgraphdemo.R
import com.example.navigationgraphdemo.databinding.FragmentProfileBinding
import com.example.navigationgraphdemo.databinding.FragmentThirdBinding

class MyProfileFragment : Fragment() {

    private lateinit var addNoteBinding: FragmentProfileBinding
    private val binding get() = addNoteBinding
    private val args: MyProfileFragmentArgs by navArgs()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        addNoteBinding= FragmentProfileBinding.inflate(inflater, container, false)
        return addNoteBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       binding.btnGoToBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.btnGoToSettings.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_profile_to_navigation_settings)
        }

        Log.d("Profile ID : ",  args.qualityLastSleep.toString())
        Log.d("Profile Name : ",args.userName.toString())
        Log.d("Profile Form Model Name : ",args.dummyModel.name)
        Log.d("Profile Form Model ID : ", args.dummyModel.id.toString())

    }
}