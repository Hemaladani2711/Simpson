package com.sample.commoncomps.Objects

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Meta {

    @SerializedName("example_query")
    @Expose
    var exampleQuery: String? = null
    @SerializedName("id")
    @Expose
    var id: String? = null
    @SerializedName("producer")
    @Expose
    var producer: Any? = null
    @SerializedName("perl_module")
    @Expose
    var perlModule: String? = null
    @SerializedName("src_name")
    @Expose
    var srcName: String? = null
    @SerializedName("repo")
    @Expose
    var repo: String? = null
    @SerializedName("created_date")
    @Expose
    var createdDate: Any? = null
    @SerializedName("topic")
    @Expose
    var topic: List<String>? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("maintainer")
    @Expose
    var maintainer: Maintainer? = null
    @SerializedName("src_url")
    @Expose
    var srcUrl: Any? = null
    @SerializedName("js_callback_name")
    @Expose
    var jsCallbackName: String? = null
    @SerializedName("developer")
    @Expose
    var developer: List<Developer>? = null
    @SerializedName("designer")
    @Expose
    var designer: Any? = null
    @SerializedName("attribution")
    @Expose
    var attribution: Any? = null
    @SerializedName("blockgroup")
    @Expose
    var blockgroup: Any? = null
    @SerializedName("dev_milestone")
    @Expose
    var devMilestone: String? = null
    @SerializedName("src_id")
    @Expose
    var srcId: Int? = null
    @SerializedName("production_state")
    @Expose
    var productionState: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("status")
    @Expose
    var status: String? = null
    @SerializedName("unsafe")
    @Expose
    var unsafe: Int? = null
    @SerializedName("src_domain")
    @Expose
    var srcDomain: String? = null
    @SerializedName("signal_from")
    @Expose
    var signalFrom: String? = null
    @SerializedName("is_stackexchange")
    @Expose
    var isStackexchange: Any? = null
    @SerializedName("src_options")
    @Expose
    var srcOptions: SrcOptions? = null
    @SerializedName("tab")
    @Expose
    var tab: String? = null
    @SerializedName("live_date")
    @Expose
    var liveDate: Any? = null
    @SerializedName("dev_date")
    @Expose
    var devDate: Any? = null

}
