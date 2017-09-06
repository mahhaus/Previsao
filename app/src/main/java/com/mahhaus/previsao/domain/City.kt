package com.mahhaus.previsao.domain

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.io.Serializable

/**
 * Created by josias on 05/09/17 - 14:03.
 *
 */
class City : RealmObject(), Serializable{


    @SerializedName("id")
    @PrimaryKey var id: Long? = null

    @SerializedName("name")
    var name: String? = null
    @SerializedName("country")
    var country: String? = null
    @SerializedName("coord")
    var coord: Coord? = null

    inner class Coord {
        @SerializedName("lon")
        var longitude: Double? = null

        @SerializedName("lat")
        var latitude: Double? = null
    }

}