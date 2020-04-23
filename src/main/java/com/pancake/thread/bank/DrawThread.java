package com.pancake.thread.bank;

/**
 * Created by zhibingze on 2020/4/12.
 */
public class DrawThread extends Thread {

    private Account account;

    private double drawAmount;

    public DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account=account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {

//        // 同步代码块   account为同步监视器    加锁-》修改-》释放锁
//        synchronized (account) {
//            if (account.getBalance() >= drawAmount) {
//                System.out.println(getName() + "取钱成功！吐出钞票:" + drawAmount);
//
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                account.setBalance(account.getBalance() - drawAmount);
//                System.out.println("余额为" + account.getBalance());
//            }else{
//                System.out.println(getName() + "取钱失败！余额不足！");
//            }
//        }
        account.draw(drawAmount);

    }

    public static void main(String []args){

        Account account = new Account("1234567", 1000);

        new DrawThread("甲", account, 800).start();
        new DrawThread("乙", account, 800).start();

    }
}
