package com.manvik.sreesilks.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.manvik.sreesilks.R;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class TransactionHolder extends RecyclerView.ViewHolder {
  public CardView cardTxn;
  public TextView txnDesc;
  public TextView txnDate;
  public TextView txnAmount;
  public TextView dueAmountPaid;
  public TextView txnCustomerId;

  public TransactionHolder(@NonNull View itemView) {
    super(itemView);
    cardTxn = (CardView) itemView.findViewById(R.id.txnCard);
    txnDesc = (TextView) itemView.findViewById(R.id.txnDesc);
    txnDate = (TextView) itemView.findViewById(R.id.txnDate);
    txnAmount = (TextView) itemView.findViewById(R.id.txnAmount);
    dueAmountPaid = (TextView) itemView.findViewById(R.id.dueAmountPaid);
    txnCustomerId = (TextView) itemView.findViewById(R.id.txnCustomerId);
  }
}
