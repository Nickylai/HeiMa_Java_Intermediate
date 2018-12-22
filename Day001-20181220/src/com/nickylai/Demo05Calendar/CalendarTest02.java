package com.nickylai.Demo05Calendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/20 14:26
 * @see
 */
public class CalendarTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个年份：");
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);
        c.add(Calendar.DATE, -1);
        if (c.get(Calendar.DATE) != 29) {
            System.out.println("平年");
        } else {
            System.out.println("闰年");
        }
    }
}