package com.mahhaus.previsao.data.rest.openweather

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject

/**
 * Created by josias on 04/09/17 - 15:54.
 */

open class Main : RealmObject() {
    @SerializedName("temp")
    var temp: Double? = null
    @SerializedName("pressure")
    var pressure: Double? = null
    @SerializedName("humidity")
    var humidity: Int? = null
    @SerializedName("temp_min")
    var tempMin: Double? = null
    @SerializedName("temp_max")
    var tempMax: Double? = null
    @SerializedName("sea_level")
    var seaLevel: Double? = null
    @SerializedName("grnd_level")
    var grndLevel: Double? = null
}