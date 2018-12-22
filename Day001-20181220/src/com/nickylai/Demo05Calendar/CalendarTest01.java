package com.nickylai.Demo05Calendar;

import java.util.Calendar;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/20 14:15
 * @see
 */
public class CalendarTest01 {
    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        Calendar c = Calendar.getInstance();
       int year=c.get(Calendar.YEAR);
        System.out.println(year);
    }


}
