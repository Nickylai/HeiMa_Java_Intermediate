package com.nickylai.Demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 2018-10-10转换为2018年10月10号
 * @time 2018/12/20 14:07
 * @see
 */
public class DateTest01 {
    public static void main(String[] args)throws ParseException {
        test01();
    }
    public static void test01() throws ParseException {
        String str = "2018-10-10";
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sd.parse(str);
        SimpleDateFormat sd1 = new SimpleDateFormat("yyyy年MM月dd日");
        String str2 = sd1.format(d);
        System.out.println(str2);

        Calendar c=Calendar.getInstance();

    }
}
