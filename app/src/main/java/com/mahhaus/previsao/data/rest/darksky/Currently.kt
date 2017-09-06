package com.mahhaus.previsao.data.rest.darksky

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.io.Serializable

/**
 * Created by josias on 05/09/17 - 08:28.
 */

open class Currently :  RealmObject(), Serializable{
    @SerializedName("time")
    @PrimaryKey var time : Long? = null

    @SerializedName("summary")
    var summary : String? = null

    @SerializedName("icon")
    var icon : String? = null

    @SerializedName("precipType")
    var precipType : String? = null

    @SerializedName("temperature")
    var temperature : Double? = null

    @SerializedName("apparentTemperature")
    var apparentTemperature : Double? = null

    @SerializedName("dewPoint")
    var dewPoint : Double? = null

    @SerializedName("humidity")
    var humidity : Double? = null

    @SerializedName("pressure")
    var pressure : Double? = null

    @SerializedName("windSpeed")
    var windSpeed : Double? = null

    @SerializedName("windBearing")
    var windBearing : Long? = null

    @SerializedName("visibility")
    var visibility : Double? = null

    @SerializedName("cloudCover")
    var cloudCover : Long? = null

    @SerializedName("uvIndex")
    var uvIndex : Long? = null
}
