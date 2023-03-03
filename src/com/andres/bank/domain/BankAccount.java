package com.andres.bank.domain;

public class BankAccount {
    public int number;
    public double balance;
    public String type;
    public Person holder;
    public Bank bank;
    public boolean isActiv;

    public boolean deposit(double moneyToDeposit){
        if(this.isActiv==true) {
            this.balance += moneyToDeposit;
            return true;
        }
        System.out.println("Deposit failed.The account id inactive");
        return  false;
    }
    public boolean withdrawal(double moneyToWithdraw) {
        if (this.isActiv && this.balance >= moneyToWithdraw) {
            this.balance -= moneyToWithdraw;
            return true;
            }

        return false;
    }
    public  boolean transfer(){
        return true;
    }
    public String getBalance(){return this.holder.name+"your balance is $"+this.balance}
}
