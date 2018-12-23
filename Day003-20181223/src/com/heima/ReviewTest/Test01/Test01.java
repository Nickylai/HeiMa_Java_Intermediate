package com.heima.ReviewTest.Test01;

import java.util.HashSet;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 一、定义人类，包含姓名和年龄属性。
 * 创建4个人存储到HashSet中，
 * 姓名和年龄相同的人看做同一人不存储。
 * @time 2018/12/23 18:54
 * @see
 */
public class Test01 {
    public static void main(String[] args) {
        HashSet<Preson> presons = new HashSet<>();
        presons.add(new Preson("小明", 11));
        presons.add(new Preson("小明", 11));
        presons.add(new Preson("小明", 18));
        presons.add(new Preson("小明", 14));

        System.out.println(presons);


    }
}
