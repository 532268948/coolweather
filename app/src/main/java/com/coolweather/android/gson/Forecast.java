package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 53226 on 2017/4/18.
 */

public class Forecast {
    @SerializedName("date")
    public String date;
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Teamperature teamperature;
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
    public class Teamperature{
        @SerializedName("max")
        public String max;
        @SerializedName("min")
        public String min;
    }
}
