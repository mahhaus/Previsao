package com.mahhaus.previsao.data.rest.openweather

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject

/**
 * Created by josias on 04/09/17 - 16:28.
 */

open class Wind: RealmObject()  {
    @SerializedName("speed")
    var speed: Double? = null
    @SerializedName("deg")
    var deg: Int? = null

}
