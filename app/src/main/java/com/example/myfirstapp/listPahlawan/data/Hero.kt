package com.example.myfirstapp.listPahlawan.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero (
    val img: String,
    val name: String,
    val desc: String
): Parcelable
