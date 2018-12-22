package com.nickylai.Extended01;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/20 15:24
 * @see
 */
public class Extended01 {
    public static void main(String[] args) {
        testString();
        testStringBuilder();
    }
    public static void testString(){
        long start;
        long end;
        String str ="abc";
        start=System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }
        System.out.println(str);
        end=System.nanoTime();
        System.out.println("String加100000次用时"+(end-start)+"纳秒");
    }
    public static void testStringBuilder(){
        long start;
        long end;
        StringBuilder str =new StringBuilder("abc");
        start=System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            str = str.append("a");
        }
        String str1=str.toString();
        System.out.println(str1);
        end=System.nanoTime();
        System.out.println("StringBuilder加100000次用时"+(end-start)+"纳秒");

    }
}
