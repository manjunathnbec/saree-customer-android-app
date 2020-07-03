package com.manvik.sreesilks.model;


public class Customer {
  private Long customerID;
  private String name;
  private String phone;
  private String address;
  private double balance;

  public Customer(String name, String ph, String address, double balance) {
    this.name = name;
    this.phone = ph;
    this.address = address;
    this.balance = balance;
  }

  public Long getCustomerID() {
    return customerID;
  }

  public void setCustomerID(Long customerID) {
    this.customerID = customerID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
