package com.heima.Demo05GenericAsteriskWildcard;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 泛型的通配符 “？”
 * 使用方式：
 *      不能创建对象使用
 *      只能作为方法的参数使用
 * @time 2018/12/21 15:43
 * @see
 */
public class GenericAsteriskWildcard {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        Integer[] in = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(in));



    }

}
