package com.berhasil.si_duan.api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    public static  final String IPCONFIG = "192.168.43.241";

    public static final String BASE_URL = "http://" + IPCONFIG + "/pengaduandesa/android-req/";

    public static BaseApiService getApiService() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(30000, TimeUnit.MILLISECONDS);
        builder.connectTimeout(30000, TimeUnit.MILLISECONDS);
        BaseApiService retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(BaseApiService.class);
        return retrofit;
    }
}
