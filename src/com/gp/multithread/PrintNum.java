package com.gp.multithread;

/**
 * @Author: pearl
 * @DATE: 2019/9/21 10:05
 * @Description: 两个线程交替打印1-10
 */
public class PrintNum implements Runnable{
    int num = 1;
    @Override
    public void run(){
        synchronized (this){
            while (true){
                notify();
                if(num <= 10){
                    try{
                        Thread.sleep(200);
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + num);
                    num ++;
                }else{
                    break;
                }
                try{
                    wait();
                    Thread.sleep(200);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args){
        PrintNum p = new PrintNum();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();
    }
}
