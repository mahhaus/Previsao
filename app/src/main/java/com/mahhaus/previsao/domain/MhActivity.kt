package com.mahhaus.previsao.domain

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by josias on 05/09/17 - 11:55.
 */

abstract class MhActivity : AppCompatActivity() {
    abstract fun mapearComponentes()
    abstract fun acoesComponentes()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
}
