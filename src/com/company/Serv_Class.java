package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Serv_Class {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int input_str2int(String mes){
        System.out.println(mes);
        String str = null;
        int ret_val = -1;
        try {
            str = br.readLine();
            if(tryParseInt(str)){
                ret_val = Integer.parseInt(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret_val;
    }

    boolean tryParseFloat(String value) {
        try {
            Float.parseFloat(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public float input_str2float(String mes){
        System.out.println(mes);
        String str = null;
        float ret_val = -1;
        try {
            str = br.readLine();
            if(tryParseFloat(str)){
                ret_val = Float.parseFloat(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret_val;
    }

    public float[] input_func(){
        float[] list_of_arrs = new float[7];
        System.out.println("Введите 7  параметров: ");

            list_of_arrs[0] = -1;
            list_of_arrs[1] = -1;

            while(list_of_arrs[0] < 0){
                list_of_arrs[0] = input_str2int("Введите параметр N");
            }
            while(list_of_arrs[1] < 0){
                list_of_arrs[1] = input_str2int("Введите параметр M");
            }


            list_of_arrs[2] = -1;
            list_of_arrs[3] = -1;
            list_of_arrs[4] = -1;
            list_of_arrs[5] = -1;
            while(list_of_arrs[2] < 0){
                list_of_arrs[2] = input_str2float("Введите параметр t1");
            }
            while(list_of_arrs[3] < 0){
                list_of_arrs[3] = input_str2int("Введите параметр t2");
            }
            while(list_of_arrs[4] < 0){
                list_of_arrs[4] = input_str2int("Введите параметр t3");
            }
            while(list_of_arrs[5] < 0){
                list_of_arrs[5] = input_str2int("Введите параметр t4");
            }

            list_of_arrs[6] = -1;

            while(list_of_arrs[6] > 100 || list_of_arrs[6] < 0){
                list_of_arrs[6] = input_str2int("Введите параметр p");
            }

            //System.out.println(N);
        return list_of_arrs;
    }
}
