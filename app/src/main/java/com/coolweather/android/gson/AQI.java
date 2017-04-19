package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 53226 on 2017/4/18.
 */

public class AQI {
    @SerializedName("city")
    public AQICity city;
    public class AQICity{
        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }
}
