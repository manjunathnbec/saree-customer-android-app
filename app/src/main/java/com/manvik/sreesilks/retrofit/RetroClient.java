package com.manvik.sreesilks.retrofit;


import com.manvik.sreesilks.service.ISareeProviderEndpoint;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClient {
  private static final String ROOT_URL = "http://15.206.146.229:30012/"; //update this
  private static Retrofit getRetrofitInstance() {

    return new Retrofit.Builder()
      .baseUrl(ROOT_URL)
      .addConverterFactory(GsonConverterFactory.create())
      .build();
  }
  public static ISareeProviderEndpoint getSareeProviderApi() {
    return getRetrofitInstance().create(ISareeProviderEndpoint.class);
  }
}
