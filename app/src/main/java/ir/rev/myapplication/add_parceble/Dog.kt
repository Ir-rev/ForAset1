package ir.rev.myapplication.add_parceble

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Dog(val name: String, val age: Int) : Parcelable