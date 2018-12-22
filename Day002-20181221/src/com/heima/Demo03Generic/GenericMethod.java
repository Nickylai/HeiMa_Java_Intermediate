package com.heima.Demo03Generic;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/21 14:37
 * @see
 */
public class GenericMethod {
    public <E> E genericMethod01(E e) {
        System.out.println(e);
        return e;
    }

    public static <E> E genericMethod02(E e) {
        System.out.println(e);
        return e;
    }
}
