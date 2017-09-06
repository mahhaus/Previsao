package com.mahhaus.previsao

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration


/**
 * Created by josias on 06/09/17 - 08:52.
 *
 */
class MhApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder().build()
        Realm.setDefaultConfiguration(realmConfig)
    }
}