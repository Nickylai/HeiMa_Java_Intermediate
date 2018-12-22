package com.nickylai.Demo03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/20 10:41
 * @see
 */
public class Test03 {
    public static void main(String[] args) {
        test01();
    }
    public static void test03(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH时mm分ss秒 z");
        Date date =new Date();
        System.out.println(sdf.format(date));
    }
    public static void test01(){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH时mm分ss秒 z");

        while (true) {
            Date date = new Date();
            for (int i = 0; i < 7000000; i++) {
            }
            System.out.println(sdf.format(date));
        }
    }

}
