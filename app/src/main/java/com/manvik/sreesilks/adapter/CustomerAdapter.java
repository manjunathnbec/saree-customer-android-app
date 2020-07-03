package com.manvik.sreesilks.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.manvik.sreesilks.R;
import com.manvik.sreesilks.holder.CustomerHolder;
import com.manvik.sreesilks.model.Customer;

import java.util.Collections;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class CustomerAdapter  extends RecyclerView.Adapter<CustomerHolder> {

  private List<Customer> customerList = Collections.emptyList();
  private Context context;

  public CustomerAdapter(List<Customer> list, Context context) {
    this.customerList = list;
    this.context = context;
  }

  @Override
  public CustomerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_info_layout, parent, false);
    return new CustomerHolder(view);
  }

  @Override
  public void onBindViewHolder(CustomerHolder holder, int position) {

    // Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
    holder.txtName.setText("Name : "+customerList.get(position).getName());
    holder.txtAddress.setText("Address : " + customerList.get(position).getAddress());
    holder.txtPhone.setText("Phone number : " + customerList.get(position).getPhone());
    holder.txtBalance.setText("Balance amount : Rs " + customerList.get(position).getBalance()+"");
  }

  @Override
  public int getItemCount() {
    return customerList.size();
  }

  @Override
  public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    super.onAttachedToRecyclerView(recyclerView);
  }

  public void insert(int position, Customer data) {
    customerList.add(position, data);
    notifyItemInserted(position);
  }

  public void remove(Customer data) {
    int position = customerList.indexOf(data);
    customerList.remove(position);
    notifyItemRemoved(position);
  }

}



