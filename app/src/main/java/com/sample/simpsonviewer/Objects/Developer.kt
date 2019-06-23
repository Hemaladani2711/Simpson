package com.sample.simpsonviewer.Objects

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Developer {

    @SerializedName("url")
    @Expose
    var url: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("type")
    @Expose
    var type: String? = null

}
