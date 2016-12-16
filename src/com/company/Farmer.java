package com.company;

/**
 * Created by user on 16.12.2016.
 */
public class Farmer implements Runnable	//(содержащее метод run())
{
    private final int num_of_goods;
    private final float time_for_ch_f;
    private final float loop_farmer;
    private final int prob_for_farm;

    public Farmer(int n, int p, float t1, float T1){
        num_of_goods = n;
        time_for_ch_f = t1;
        loop_farmer = T1;
        prob_for_farm = p;
    }


    public void run()		//Этот метод буде т выполняться в побочном потоке
    {
        System.out.println("Привет из побочного потока!");
    }
}