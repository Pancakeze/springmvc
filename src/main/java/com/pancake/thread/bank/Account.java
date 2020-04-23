package com.pancake.thread.bank;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhibingze on 2020/4/12.
 */
public class Account  {

    Lock lock = new ReentrantLock();
    Condition cond = lock.newCondition();

    private String accountNo;

    private double balance;

    public Account() { }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj instanceof Account) {
            Account target = (Account) obj;

            return this.accountNo.equals(target.getAccountNo());
        }
        return false;
    }

    // 取钱  同步方法。
    public synchronized void draw(double drawAmount) {
        if (balance >= drawAmount) {
            System.out.println(Thread.currentThread().getName() + "取钱成功!吐出钞票:" + drawAmount);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= drawAmount;
            System.out.println(Thread.currentThread().getName() + "余额为:" + balance);
        }else{
            System.out.println(Thread.currentThread().getName() + "取钱失败!余额不足！");

        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
