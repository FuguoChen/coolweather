package com.coolweather.android.gson;

/**
 * Created by chenfg on 2018/2/23.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
