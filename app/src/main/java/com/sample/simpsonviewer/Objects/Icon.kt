package com.sample.simpsonviewer.Objects

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Icon {

    @SerializedName("Width")
    @Expose
    var width: String? = null
    @SerializedName("URL")
    @Expose
    var url: String? = null
    @SerializedName("Height")
    @Expose
    var height: String? = null

}
