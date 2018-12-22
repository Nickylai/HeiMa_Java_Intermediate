package com.nickylai.Demo08Integer;

import java.util.ArrayList;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/20 16:20
 * @see
 */
public class Test01Integer {
    public static void main(String[] args) {
        Integer in1 = new Integer(1);
        in1=2;
        System.out.println(in1);

        Integer in2 = new Integer(1);
        in2=35;
        System.out.println(in2);

        int in3=in1;
        System.out.println(in3);

        int in4=in2;
        System.out.println(in4);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        int i = list.get(0);
        System.out.println(i);

    }
}
