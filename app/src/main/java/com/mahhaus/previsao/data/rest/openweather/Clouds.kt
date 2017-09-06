package com.mahhaus.previsao.data.rest.openweather

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import java.io.Serializable

/**
 * Created by josias on 04/09/17 - 15:52.
 */

open class Clouds: RealmObject() ,Serializable {
    @SerializedName("all")
    var all: Int? = null
}