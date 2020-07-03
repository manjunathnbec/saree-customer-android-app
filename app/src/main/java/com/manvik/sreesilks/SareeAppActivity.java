package com.manvik.sreesilks;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.manvik.sreesilks.adapter.CustomerAdapter;
import com.manvik.sreesilks.adapter.TransactionAdapter;
import com.manvik.sreesilks.model.Customer;
import com.manvik.sreesilks.model.TransactionInfo;
import com.manvik.sreesilks.retrofit.RetroClient;
import com.manvik.sreesilks.service.ISareeProviderEndpoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;

public class SareeAppActivity extends AppCompatActivity {

  private ArrayList<Customer> customerList;
  private ArrayList<TransactionInfo> transactionInfoList;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.saree_main_activity);
   // loadSareeCustomersList();
    loadTransactionsList();
  }

  protected void loadSareeCustomersList() {
    final ProgressDialog dialog = new ProgressDialog(SareeAppActivity.this);
    dialog.setTitle("Loading Customer Data");
    dialog.setMessage("Hold on ...");
    dialog.show();

    ISareeProviderEndpoint api = RetroClient.getSareeProviderApi();

    Call<List<Customer>> call = api.getAllCustomers();

    call.enqueue(new retrofit2.Callback<List<Customer>>() {

      @Override
      public void onResponse(Call<List<Customer>> call, retrofit2.Response<List<Customer>> response) {
        dialog.dismiss();
        if (response.isSuccessful()) {
          customerList = (ArrayList<Customer>) response.body();
          RecyclerView recyclerContacts = (RecyclerView) findViewById(R.id.recycle_item_list);
          CustomerAdapter adapter = new CustomerAdapter(customerList, SareeAppActivity.this);
          recyclerContacts.setAdapter(adapter);
          recyclerContacts.setLayoutManager(new LinearLayoutManager(SareeAppActivity.this));
        }
      }

      @Override
      public void onFailure(Call<List<Customer>> call, Throwable t) {
        dialog.dismiss();
      }
    });

  }


  protected void loadTransactionsList() {
    final ProgressDialog dialog = new ProgressDialog(SareeAppActivity.this);
    dialog.setTitle("Loading Transactions Data");
    dialog.setMessage("Hold on ...");
    dialog.show();

    ISareeProviderEndpoint api = RetroClient.getSareeProviderApi();

    Call<List<TransactionInfo>> call = api.getAllTransactions();


    call.enqueue(new retrofit2.Callback<List<TransactionInfo>>() {

      @Override
      public void onResponse(Call<List<TransactionInfo>> call, retrofit2.Response<List<TransactionInfo>> response) {
        dialog.dismiss();
        if (response.isSuccessful()) {
          transactionInfoList = (ArrayList<TransactionInfo>) response.body();
          RecyclerView recyclerContacts = (RecyclerView) findViewById(R.id.recycle_item_list);
          TransactionAdapter adapter = new TransactionAdapter(transactionInfoList, SareeAppActivity.this);
          recyclerContacts.setAdapter(adapter);
          recyclerContacts.setLayoutManager(new LinearLayoutManager(SareeAppActivity.this));
        }
      }

      @Override
      public void onFailure(Call<List<TransactionInfo>> call, Throwable t) {
        System.out.println(Arrays.toString(t.getStackTrace()));
        dialog.dismiss();
      }
    });

  }
}

