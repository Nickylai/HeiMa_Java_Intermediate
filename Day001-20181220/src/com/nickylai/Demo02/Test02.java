package com.nickylai.Demo02;

import java.util.Date;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/20 10:06
 * @see
 */
public class Test02 {
    public static void main(String[] args) {
        test1();
        test2();
    }
    public static void test2(){
        System.out.println(new Date(128894651798465L));
    }
    public static void test1() {
        Date date = new Date();
        System.out.println(date);
    }
}
