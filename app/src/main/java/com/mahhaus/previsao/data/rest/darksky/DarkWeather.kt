package com.mahhaus.previsao.data.rest.darksky

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import java.io.Serializable


/**
 * Created by josias on 05/09/17 - 09:34.
 *
 */
open class DarkWeather : RealmObject(), Serializable {

    @SerializedName("latitude")
    var latitude: Double? = null
    @SerializedName("longitude")
    var longitude: Double? = null
    @SerializedName("timezone")
    var timezone: String? = null
    @SerializedName("currently")
    var currently: Currently? = null
    @SerializedName("hourly")
    var hourly: Hourly? = null
    @SerializedName("daily")
    var daily: Daily? = null
//    @SerializedName("flags")
//    var flags: Flags? = null
    @SerializedName("offset")
    var offset: Long? = null
}
