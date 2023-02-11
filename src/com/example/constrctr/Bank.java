package com.example.constrctr;

public class Bank {
    String name;
    double accountNo;

    Bank(String name,double accountNo){
      this.name  = name;
      this.accountNo=accountNo;
    }

    public static void main(String[] args) {
        Bank bank= new Bank("sudheer",12346466.56);
        System.out.println(bank.accountNo);
        System.out.println(bank.name);

    }
}
