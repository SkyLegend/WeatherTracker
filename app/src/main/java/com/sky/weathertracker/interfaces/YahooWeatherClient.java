package com.sky.weathertracker.interfaces;

import retrofit.http.GET;
import retrofit.http.Query;
import com.sky.weathertracker.models.Weather;
import java.util.List;

/**
 * YahooWeatherClient
 * @description YahooWeatherClient Interface contains request method for the Yahoo Weather API.
 *
 * @author Thomas Tran
 * @date 04-05-2015
 */
public interface YahooWeatherClient {
    //TODO: When passing in the string we must dynamically build it based on the user location preference.
    @GET("v1/public/yql")
    List<Weather> getWeather(@Query("q") String query);
}