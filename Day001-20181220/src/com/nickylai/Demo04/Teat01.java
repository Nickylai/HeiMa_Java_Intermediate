package com.nickylai.Demo04;

import javafx.beans.binding.StringBinding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/20 11:09
 * @see
 */
public class Teat01 {
    public static void main(String[] args) throws ParseException {

        survivalTime();
    }

    public static void survivalTime() throws ParseException {
        /**
         * @Description TODO计算用户从出生开始存活的天数
         * @param  year
         * @return: void
         * @auther: Nickylai
         * @date: 2018/12/20 12:12
         */
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd");
        System.out.println("请输入你的出生年份：（格式2018）");
        String year = sc.next();
        System.out.println("请输入你的出生月份：（格式01-12）");
        String month = sc.next();
        System.out.println("请输入你的出生日期：（格式01-31）");
        String day = sc.next();
        String birthday = year + '年' + month + '月' + day + '日';
        Date birthDate = sdf.parse(birthday);
        Date todayDate = new Date();
        long birthDateSecond = birthDate.getTime();
        long todayDateSecond = todayDate.getTime();
        long second = todayDateSecond - birthDateSecond;
        if (second < 0) {
            System.out.println("还没出生");

        } else {
            System.out.println(second / 1000 / 60 / 60 / 24);
        }

    }
}
