package com.example.navigationgraphdemo.MODEL

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class DummyModel(var name : String,var id : Int) : Parcelable
