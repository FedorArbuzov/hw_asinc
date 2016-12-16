package com.company;

import java.util.Random;

public class GroceryStore {

    //Переменая для числа товаров
    private volatile int num_of_goods = 0;


    private final int num_of_farmers;
    private final int num_of_sellers;
    private final int time_for_ch_f;
    private final int time_for_ch_s;
    private final int loop_farmer;
    private final int loop_Seller;
    private final int prob_for_farm;
    private Random rnd = new Random();

    //Объект для фермеров
    static Farmer allFarmers;

    //Объект для продовцов
    static Seller allSellers;

    public GroceryStore(int N, int M, int t1, int t2, int T1, int T2, int p){
        num_of_farmers = N;
        num_of_sellers = M;
        time_for_ch_f = t1;
        time_for_ch_s = t2;
        loop_farmer = T1;
        loop_Seller = T2;
        prob_for_farm = p;

    }
    public void StartStore(){
        Thread[] list_of_farmers = new Thread[num_of_farmers];
        Thread[] list_of_sellers = new Thread[num_of_sellers];
        for(int i = 0; i < list_of_farmers.length; i++){
            int n = rnd.nextInt(90) + 10;
            list_of_farmers[i] = new Thread(new Farmer(n, prob_for_farm, time_for_ch_f, loop_farmer));
            list_of_farmers[i].setName("F_" + i);
        }
        for(int i = 0; i < list_of_sellers.length; i++){
            int m = rnd.nextInt(90) + 10;
            list_of_farmers[i] = new Thread(new Seller(m, time_for_ch_s, loop_Seller));
            list_of_farmers[i].setName("S_" + i);
        }

    }

}
