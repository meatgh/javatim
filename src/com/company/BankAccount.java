package com.company;

public class BankAccount {

    private int accountNo;
    private   double balance;
    private   String customerName;
    private   String email;
    private   int phoneNo;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public  void deposit(double amount){
        if(amount <= 0){
            System.out.println("amount cannot be less than or zero");
        }else{
            balance = balance + amount;
        }
    }

    public  void withdraw(int amount){

        if(balance < 0 || balance - amount< 0){
            System.out.println("insufficient funds in your account");
        } else{
            balance = balance - amount;
        }

    }
}
