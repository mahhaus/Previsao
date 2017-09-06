package com.mahhaus.previsao.data.rest.darksky

import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import java.io.Serializable


/**
 * Created by josias on 05/09/17 - 09:35.
 *
 */
open class Hourly :  RealmObject(), Serializable {
    @SerializedName("summary")
    var summary: String? = null

    @SerializedName("icon")
    var icon: String? = null

    @SerializedName("data")
    var data: RealmList<Currently>? = null
}