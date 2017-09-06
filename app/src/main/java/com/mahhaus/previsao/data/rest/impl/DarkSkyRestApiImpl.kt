package com.mahhaus.previsao.data.rest.impl

import android.util.Log
import com.google.gson.Gson
import com.mahhaus.previsao.data.props.RestProps
import com.mahhaus.previsao.data.rest.darksky.DarkWeather
import retrofit2.Call
import retrofit2.http.*
import java.io.IOException

/**
 * Created by josias on 04/09/17 - 17:59.
 *
 */
class DarkSkyRestApiImpl{
    interface Api {
        @GET("/forecast/{key}/{latitude},{longitude},{time}")
        fun DarkSkyWeatherByCoordinates(
                @Path("key") key : String ,
                @Path("latitude") latitude : Double,
                @Path("longitude") longitude : Double,
                @Path("time") time : Long,
                @Query("units") units: String, @Query("lang") lang: String): Call<DarkWeather>


    }


    @Throws(IOException::class)
    fun darkSkyWeatherByCoordinates(key: String, latitude: Double, longitude: Double, time:Long, units: String, lang:String): DarkWeather? {
        val retrofit = RetrofitImpl().buildRetrofit(RestProps.Props.URL_DARKSKY)

        val lRestApi = retrofit.create(Api::class.java)

        val lResponseCall = lRestApi.DarkSkyWeatherByCoordinates(key, latitude, longitude, time,  units, lang)
        Log.i(TAG, "GetDirectionsApi: " + lResponseCall.request().url().toString())

        val lExecute = lResponseCall.execute()
        val lResponse = lExecute.body()
        Log.i(TAG, "GetDirectionsApi: " + Gson().toJson(lResponse))

        return lResponse
    }

    companion object {
        private val TAG = this::class.simpleName
    }
}