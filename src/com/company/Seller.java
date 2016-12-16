package com.company;

/**
 * Created by user on 16.12.2016.
 */
public class Seller implements Runnable {

    private final int num_of_goods;
    private final float time_for_ch_s;
    private final float loop_seller;

    public Seller(int m, float t2, float T2){
        num_of_goods = m;
        time_for_ch_s = t2;
        loop_seller = T2;
    }

    public void run()		//Этот метод будет выполняться в побочном потоке
    {
        System.out.println("Привет из побочного потока!");
    }
}
