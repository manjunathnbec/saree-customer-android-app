package com.manvik.sreesilks.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.manvik.sreesilks.R;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomerHolder extends RecyclerView.ViewHolder {
  public CardView cardContact;
  public TextView txtName;
  public TextView txtPhone;
  public TextView txtAddress;
  public TextView txtBalance;
  public ImageView imgContact;

  public CustomerHolder(View itemView) {
    super(itemView);
    cardContact = (CardView) itemView.findViewById(R.id.cardContact);
    txtName = (TextView) itemView.findViewById(R.id.txtName);
    txtPhone = (TextView) itemView.findViewById(R.id.txtPhone);
    txtBalance = (TextView) itemView.findViewById(R.id.txtBalance);
    txtAddress = (TextView) itemView.findViewById(R.id.txtAddress);
    imgContact = (ImageView) itemView.findViewById(R.id.imgContact);
  }
}
