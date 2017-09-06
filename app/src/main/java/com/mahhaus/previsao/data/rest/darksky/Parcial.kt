package com.mahhaus.previsao.data.rest.darksky

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import java.io.Serializable


/**
 * Created by josias on 05/09/17 - 09:37.
 *
 */
open class Parcial :  RealmObject(), Serializable {

    @SerializedName("time")
    var time: Long? = null
    
    @SerializedName("summary")
    var summary: String? = null
    
    @SerializedName("icon")
    var icon: String? = null
    
    @SerializedName("sunriseTime")
    var sunriseTime: Long? = null
    
    @SerializedName("sunsetTime")
    var sunsetTime: Long? = null
    
    @SerializedName("moonPhase")
    var moonPhase: Double? = null
    
    @SerializedName("precipType")
    var precipType: String? = null
    
    @SerializedName("temperatureHigh")
    var temperatureHigh: Double? = null
    
    @SerializedName("temperatureHighTime")
    var temperatureHighTime: Long? = null
    
    @SerializedName("temperatureLow")
    var temperatureLow: Double? = null
    
    @SerializedName("temperatureLowTime")
    var temperatureLowTime: Long? = null
    
    @SerializedName("apparentTemperatureHigh")
    var apparentTemperatureHigh: Double? = null
    
    @SerializedName("apparentTemperatureHighTime")
    var apparentTemperatureHighTime: Long? = null
    
    @SerializedName("apparentTemperatureLow")
    var apparentTemperatureLow: Double? = null
    
    @SerializedName("apparentTemperatureLowTime")
    var apparentTemperatureLowTime: Long? = null
    
    @SerializedName("dewPoint")
    var dewPoint: Double? = null
    
    @SerializedName("humidity")
    var humidity: Double? = null
    
    @SerializedName("pressure")
    var pressure: Double? = null
    
    @SerializedName("windSpeed")
    var windSpeed: Double? = null
    
    @SerializedName("windBearing")
    var windBearing: Long? = null
    
    @SerializedName("visibility")
    var visibility: Double? = null
    
    @SerializedName("temperatureMin")
    var temperatureMin: Double? = null
    
    @SerializedName("temperatureMinTime")
    var temperatureMinTime: Long? = null
    
    @SerializedName("temperatureMax")
    var temperatureMax: Double? = null
    
    @SerializedName("temperatureMaxTime")
    var temperatureMaxTime: Long? = null
    
    @SerializedName("apparentTemperatureMin")
    var apparentTemperatureMin: Double? = null
    
    @SerializedName("apparentTemperatureMinTime")
    var apparentTemperatureMinTime: Long? = null
    
    @SerializedName("apparentTemperatureMax")
    var apparentTemperatureMax: Double? = null
    
    @SerializedName("apparentTemperatureMaxTime")
    var apparentTemperatureMaxTime: Long? = null
}