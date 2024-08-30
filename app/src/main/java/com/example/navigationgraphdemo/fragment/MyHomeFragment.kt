package com.example.navigationgraphdemo.fragment

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.LeadingMarginSpan
import android.text.style.RelativeSizeSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationgraphdemo.R
import com.example.navigationgraphdemo.databinding.FragmentHomeBinding


class MyHomeFragment : Fragment() {

    private lateinit var addNoteBinding: FragmentHomeBinding
    private val binding get() = addNoteBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        addNoteBinding= FragmentHomeBinding.inflate(inflater, container, false)
        return addNoteBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = binding.tvTitle.text.toString()

// Create a SpannableString
        val spannableString = SpannableString(text)

        spannableString.setSpan(RelativeSizeSpan(2.5f), 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

// Apply a LeadingMarginSpan to indent the text properly

// Apply a LeadingMarginSpan to indent the text properly
        spannableString.setSpan(
            LeadingMarginSpan.Standard(100, 0),
            1,
            spannableString.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )

// Apply to TextView
        binding.tvTitle.text = spannableString

        binding.btnOpenDialog.setOnClickListener {
            findNavController().navigate(
                R.id.action_navigation_home_to_myDialog)

        }
    }
}