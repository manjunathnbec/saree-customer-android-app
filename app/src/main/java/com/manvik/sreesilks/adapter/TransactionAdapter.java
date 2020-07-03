package com.manvik.sreesilks.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.manvik.sreesilks.R;
import com.manvik.sreesilks.holder.CustomerHolder;
import com.manvik.sreesilks.holder.TransactionHolder;
import com.manvik.sreesilks.model.TransactionInfo;

import java.util.Collections;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class TransactionAdapter  extends RecyclerView.Adapter<TransactionHolder> {

  private List<TransactionInfo> transactionInfoList = Collections.emptyList();
  private Context context;

  public TransactionAdapter(List<TransactionInfo> list, Context context) {
    this.transactionInfoList = list;
    this.context = context;
  }

  @Override
  public TransactionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_info_layout, parent, false);
    return new TransactionHolder(view);
  }


  @Override
  public void onBindViewHolder(TransactionHolder holder, int position) {

    holder.txnDesc.setText("Name : "+ transactionInfoList.get(position).getTransactionDetails());
    holder.txnDate.setText("Date : "+ transactionInfoList.get(position).getDate());
    holder.txnAmount.setText("Txn Amount : "+ transactionInfoList.get(position).getTransactionAmount());
    holder.txnCustomerId.setText("Customer Id : "+ transactionInfoList.get(position).getCustomerId());
    holder.dueAmountPaid.setText("Due Amount Paid : "+ transactionInfoList.get(position).getAmountPaid());
  }

  @Override
  public int getItemCount() {
    return transactionInfoList.size();
  }

  @Override
  public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    super.onAttachedToRecyclerView(recyclerView);
  }

  public void insert(int position, TransactionInfo data) {
    transactionInfoList.add(position, data);
    notifyItemInserted(position);
  }

  public void remove(TransactionInfo data) {
    int position = transactionInfoList.indexOf(data);
    transactionInfoList.remove(position);
    notifyItemRemoved(position);
  }

}



