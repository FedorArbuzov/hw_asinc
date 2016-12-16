package com.company;

public class Main {


    public static void main(String[] args) {

        float[] list_of_args = new float[7];
        Serv_Class sc = new Serv_Class();
        // N M t1 t2 T1 T2 p
            if(args.length == 0){
                sc.input_func();
            }
            else if(args.length < 7){
                System.out.println("Данные были введены некорректно, попробуйте еще раз:");
                sc.input_func();
            }
            else{

                if(sc.tryParseInt(args[0]) && sc.tryParseInt(args[1]) && sc.tryParseFloat(args[2]) && sc.tryParseFloat(args[3])
                        && sc.tryParseFloat(args[4]) && sc.tryParseFloat(args[5]) && sc.tryParseInt(args[6])
                        && (sc.input_str2int(args[0]) > 0) && (sc.input_str2int(args[1]) > 0) && (sc.input_str2float(args[2]) > 0)
                        && (sc.input_str2float(args[3]) > 0) && (sc.input_str2float(args[4]) > 0)
                        && (sc.input_str2float(args[5]) > 0) && (sc.input_str2int(args[6]) > 0) && (sc.input_str2int(args[6]) < 101)){


                    list_of_args[0] = sc.input_str2int(args[0]);
                    list_of_args[1] = sc.input_str2int(args[1]);
                    list_of_args[2] = sc.input_str2float(args[2]);
                    list_of_args[3] = sc.input_str2float(args[3]);
                    list_of_args[4] = sc.input_str2float(args[4]);
                    list_of_args[5] = sc.input_str2float(args[5]);
                    list_of_args[6] = sc.input_str2int(args[6]);

                }
                else{
                    System.out.println("Данные были введены некорректно, попробуйте еще раз:");
                    sc.input_func();
                }
            }
        System.out.println("Вы ввели все данные");
        //start work with threads
    }
}

