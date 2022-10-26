package com.company;
import java.lang.*;
import java.util.*;
class Savings
{
    long accountNum;
    long amount;
    Savings(long accountNum,long money)
    {
        this.accountNum=accountNum;
        this.amount=money;
    }
    public void fixedDeposit(long money)
    {
        amount=amount+money;
        System.out.println("The amount deposited is"+amount);
    }
    public long totalMoney()
    {
        return amount;
    }
}
class Current
{
    long accountNum,amount;
    Current(long accountNum,long money)
    {
        this.accountNum=accountNum;
        this.amount=money;
    }
    public void credit(long money)
    {
        this.amount=amount+money;
        System.out.println("The amount Credited is "+amount);
    }
    public long totalMoney()
    {
        return amount;
    }
}
public class Main{

    public static void main(String[] args) {
       Savings saving=new Savings(1100012300,1000);
       Current current=new Current(1100012301,1000);
       saving.fixedDeposit(20000);
       long amount1=saving.totalMoney();
       current.credit(15000);
       long amount2= current.totalMoney();
       long totalAmount=amount1+amount2;
       System.out.println("Total Amount in the Bank is "+totalAmount);

    }
}
