package com.manvik.sreesilks.service;

import com.manvik.sreesilks.model.Customer;
import com.manvik.sreesilks.model.TransactionInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ISareeProviderEndpoint {
  @GET("customer/{id}")
  void getUser(@Path("id") long id, Callback<Customer> cb);

  @GET("customer/all")
  Call<List<Customer>> getAllCustomers();

  @POST("customer/add")
  void createCustomer(@Body Customer user, Callback<Customer> cb);

  @GET("transaction/all")
  Call<List<TransactionInfo>> getAllTransactions();
}
