package com.mahhaus.previsao.data.rest.openweather

import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by josias on 04/09/17 - 15:50.
 */

open class GetWeather : RealmObject() {
    @SerializedName("id")
    @PrimaryKey
    var id: Long? = null
    @SerializedName("coord")
    var coord: Coord? = null
    @SerializedName("weather")
    var weather: RealmList<Weather>? = null
    @SerializedName("base")
    var base: String? = null
    @SerializedName("main")
    var main: Main? = null
    @SerializedName("wind")
    var wind: Wind? = null
    @SerializedName("clouds")
    var clouds: Clouds? = null
    @SerializedName("dt")
    var dt: Long? = null
    @SerializedName("sys")
    var sys: Sys? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("cod")
    var cod: Long? = null
}
