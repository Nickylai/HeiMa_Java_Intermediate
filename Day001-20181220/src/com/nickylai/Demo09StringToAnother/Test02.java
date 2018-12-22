package com.nickylai.Demo09StringToAnother;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/20 16:47
 * @see
 */
public class Test02 {
    public static void main(String[] args) {
        String str1 = "3";
        String str2 = "1.5";
        int i = Integer.parseInt(str1);
        double v = Double.parseDouble(str2);
        double sum=i+v;
        String str3 = Double.toString(sum);
        String[] s = str3.split("\\.");
        int zhengShu=Integer.parseInt(s[0]);
        int xiaoShu = Integer.parseInt(s[1]);
        System.out.println(zhengShu+xiaoShu);



    }
}

