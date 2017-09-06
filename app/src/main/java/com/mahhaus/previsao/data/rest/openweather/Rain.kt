package com.mahhaus.previsao.data.rest.openweather

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject

/**
 * Created by josias on 04/09/17 - 16:38.
 *
 */
open class Rain: RealmObject() {
    @SerializedName("3h")
    var h3 : Double? = null
}