package com.rais.haidar.indonesiahalaldirectory.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hoidar on 10/5/18.
 */

public class InstanceRetrofit {
    public static final String WebUrl = "http://api.agusadiyanto.net/halal/";

    public static Retrofit setInit() {
        return new Retrofit.Builder()
                .baseUrl(WebUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static ApiService getInstance() {
        return setInit().create(ApiService.class);
    }
}
