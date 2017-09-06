package com.mahhaus.previsao.data.rest.openweather

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject

/**
 * Created by josias on 04/09/17 - 15:54.
 */

open class Coord : RealmObject(){

    @SerializedName("lon")
    var longitude: Double? = null

    @SerializedName("lat")
    var latitude: Double? = null

}