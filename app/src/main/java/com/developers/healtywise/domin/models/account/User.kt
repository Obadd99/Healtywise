package com.developers.healtywise.domin.models.account

import android.os.Parcel
import android.os.Parcelable
import com.developers.healtywise.common.helpers.utils.Constants.HOLDER_ICON
import com.google.firebase.firestore.Exclude
import com.google.firebase.firestore.IgnoreExtraProperties
import com.google.gson.annotations.Expose


@IgnoreExtraProperties
data class User(
     val userId: String="",
     val firstName: String="",
     val lastName: String="",
     val email: String="",
     val mobile: String="",
     val imageProfile: String= HOLDER_ICON,
     val birthDate: String= "",
     val doctor: Boolean= false,
     val male: Boolean= false,
     @Exclude
     val imageProfileUploaded: String?=null,
):Parcelable {
     override fun describeContents(): Int {
          return 0
     }

     override fun writeToParcel(p0: Parcel?, p1: Int) {
     }
}