package com.sky.weathertracker.sync;

import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * YahooWeatherServiceGenerator
 * @description YahooWeatherServiceGenerator class create a service class connects to the Yahoo
 *              weather api. It will return data based on the interface request method specified.
 *
 * @author Thomas Tran
 * @date 04-05-2015
 */
public class YahooWeatherServiceGenerator {
    public static <S> S createService(Class<S> serviceClass, String baseUrl){
        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(baseUrl)
                .setClient(new OkClient(new OkHttpClient()));

        RestAdapter adapter = builder.build();

        return adapter.create(serviceClass);
    }
}
