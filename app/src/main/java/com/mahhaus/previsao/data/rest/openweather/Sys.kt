package com.mahhaus.previsao.data.rest.openweather

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject

/**
 * Created by josias on 04/09/17 - 15:58.
 */

open class Sys : RealmObject() {
    @SerializedName("message")
    var message: Double? = null
    @SerializedName("country")
    var country: String? = null
    @SerializedName("sunrise")
    var sunrise: Int? = null
    @SerializedName("sunset")
    var sunset: Int? = null
}