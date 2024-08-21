package com.example.navigationgraphdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.example.navigationgraphdemo.MODEL.DummyModel
import com.example.navigationgraphdemo.R
import com.example.navigationgraphdemo.databinding.FragmentThirdBinding

class MyThirdFragment : Fragment() {

    private lateinit var addNoteBinding: FragmentThirdBinding
    private val binding get() = addNoteBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        addNoteBinding= FragmentThirdBinding.inflate(inflater, container, false)
        return addNoteBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGoToProfile.setOnClickListener {

            val dummyModel = DummyModel("Harjeet Singh",1002)
            val action = MyThirdFragmentDirections.actionNavigationThirdToNavigationProfile(1001,"Sunil Kumar",dummyModel)
            findNavController().navigate(action,null)

//            var bundle = Bundle()
//            bundle.putInt("profileId",1)
          //  findNavController().navigate(R.id.action_navigation_third_to_navigation_profile)
        }

    }
}