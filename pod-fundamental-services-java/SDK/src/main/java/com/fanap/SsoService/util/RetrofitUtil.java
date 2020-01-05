package com.fanap.SsoService.util;

import com.fanap.SsoService.config.BaseURL;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Date;

/**
 * Created By Khojasteh on 2/25/2019
 */
public class RetrofitUtil {


    private static final String BASE_URL = BaseURL.SSO_ADDRESS.getValue();
    private static Retrofit retrofit = null;

    public static synchronized Retrofit getInstance() {
        if (retrofit == null) {
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(Date.class, new MyDateTypeAdapter())
                    .create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }


}
