package com.mahhaus.previsao.data.rest.impl

import android.util.Log
import com.google.gson.Gson
import com.mahhaus.previsao.data.props.RestProps
import com.mahhaus.previsao.data.rest.openweather.GetWeather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.io.IOException

/**
 * Created by josias on 04/09/17.
 */

class OpenWeatherRestApiImpl {

    interface Api {
        @GET("/weather")
        fun OpenWeatherByCity(
                @Query("appid") appid: String,
                @Query("q") cidade: String): Call<GetWeather>

        @GET("/weather")
        fun OpenWeatherByCoordinates(
                @Query("appid") appid: String,
                @Query("lat") latitude : Double,
                @Query("lon") longitude : Double): Call<GetWeather>
    }


    @Throws(IOException::class)
    fun getWeatherByCoordinates(appid: String, latitude: Double, longitude: Double): GetWeather? {
        val retrofit = RetrofitImpl().buildRetrofit(RestProps.Props.URL_OPENWEATHER)

        val lRestApi = retrofit.create(Api::class.java)

        val lResponseCall = lRestApi.OpenWeatherByCoordinates(appid, latitude, longitude)
        Log.i(TAG, "OpenWeather: " + lResponseCall.request().url().toString())

        val lExecute = lResponseCall.execute()
        val lResponse = lExecute.body()
        Log.i(TAG, "OpenWeather: " + Gson().toJson(lResponse))

        return lResponse
    }

    companion object {
        private val TAG = this::class.simpleName
    }

}
