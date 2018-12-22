package com.nickylai.Demo06System;

import java.util.Arrays;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/20 14:49
 * @see
 */
public class Demo01System {
    public static void main(String[] args) {
        test01();
    }
    public static void test01(){
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] dest = {7, 8, 9, 10, 11, 12};
        System.out.println("复制前"+ Arrays.toString(a));
        System.arraycopy(a,0,dest,0,3);
        System.out.println("复制前"+ Arrays.toString(dest));
    }
}
