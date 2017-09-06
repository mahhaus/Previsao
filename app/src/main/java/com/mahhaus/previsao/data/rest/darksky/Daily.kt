package com.mahhaus.previsao.data.rest.darksky

import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import java.io.Serializable


/**
 * Created by josias on 05/09/17 - 09:35.
 *
 */
open class Daily :  RealmObject(), Serializable {
    @SerializedName("data")
    var data: RealmList<Parcial>? = null
}