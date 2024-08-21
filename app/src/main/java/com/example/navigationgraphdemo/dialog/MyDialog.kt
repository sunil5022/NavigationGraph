package com.example.navigationgraphdemo.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.navigationgraphdemo.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MyDialog : BottomSheetDialogFragment() {

    private var btnGoToBack: Button? = null
    private var view: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        view = inflater.inflate(
            R.layout.my_dialog,
            container, false
        )
        btnGoToBack = view?.findViewById(R.id.btnDismiss)
        btnGoToBack?.setOnClickListener {
            dismiss()
        }
        return view
    }
}