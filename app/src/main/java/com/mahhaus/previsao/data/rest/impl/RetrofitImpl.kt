package com.mahhaus.previsao.data.rest.impl

import com.google.gson.GsonBuilder
import com.mahhaus.previsao.data.props.RestProps
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by josias on 04/09/17 - 15:32.
 */
class RetrofitImpl {

    fun buildRetrofit(): Retrofit {
        return buildRetrofit(null)
    }

    fun buildRetrofit(pBaseUrl: String?): Retrofit {
        val lGson = GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZZ").create()
        val lInterceptor = HttpLoggingInterceptor()
        lInterceptor.level = HttpLoggingInterceptor.Level.BODY
        val lBuild = OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(lInterceptor)
                .build()

        return Retrofit.Builder()
                .baseUrl(pBaseUrl ?: RestProps.Props.URL_ATS)
                .addConverterFactory(GsonConverterFactory.create(lGson))
                .client(lBuild)
                .build()
    }
}