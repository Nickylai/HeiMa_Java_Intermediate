package com.nickylai.Demo09StringToAnother;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/20 16:40
 * @see
 */
public class Test01 {
    public static void main(String[] args) {
        Integer a=7418596;
        String str=a.toString()+"1254" ;
        System.out.println(str);

        long  b=Long.parseLong(str);
        System.out.println(b);
    }
}
