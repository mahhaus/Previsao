package com.mahhaus.previsao.app

import android.os.Bundle
import com.mahhaus.previsao.R
import com.mahhaus.previsao.domain.MhActivity

/**
 * Created by josias on 05/09/17 - 11:53.
 *
 */
class TimeNow : MhActivity(){
    override fun mapearComponentes() {
    }

    override fun acoesComponentes() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.timenow_activity)
        mapearComponentes()
        acoesComponentes()
    }
}