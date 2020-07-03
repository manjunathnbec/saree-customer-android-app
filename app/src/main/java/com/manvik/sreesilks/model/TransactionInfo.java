package com.manvik.sreesilks.model;


import java.time.LocalDate;

public class TransactionInfo {
  private int transactionId;
  private String date;
  private long customerId;
  private double transactionAmount;
  private String transactionDetails;
  private double amountPaid;

  public TransactionInfo(String localDate, long customerId,
                         double transactionAmount,
                         String transactionDetails,
                         double dueAmountPaid){
    this.date = localDate;
    this.customerId = customerId;
    this.transactionAmount = transactionAmount;
    this.transactionDetails = transactionDetails;
    this.amountPaid = dueAmountPaid;
  }

  public int getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(int transactionId) {
    this.transactionId = transactionId;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public double getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(double transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public String getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(String transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  public double getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(double amountPaid) {
    this.amountPaid = amountPaid;
  }
}
