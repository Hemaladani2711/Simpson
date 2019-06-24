package com.sample.commoncomps.Objects

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RelatedTopic {

    @SerializedName("Text")
    @Expose
    var text: String? = null
    @SerializedName("Icon")
    @Expose
    var icon: Icon? = null
    @SerializedName("FirstURL")
    @Expose
    var firstURL: String? = null
    @SerializedName("Result")
    @Expose
    var result: String? = null

}
