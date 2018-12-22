package com.nickylai.Demo02;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/20 9:58
 * @see
 */
public class Test1 {
    public static void main(String[] args) {
        long start = System.nanoTime();
//        for (int i = 0; i < 60; i++) {
//            System.out.print(i);
//        }
//        System.out.println(" ");
        long end =System.nanoTime();
        System.out.println(start+"\n"+end+"\n"+(end-start));
    }
}
