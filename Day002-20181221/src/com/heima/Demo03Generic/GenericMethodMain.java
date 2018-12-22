package com.heima.Demo03Generic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/21 14:52
 * @see
 */
public class GenericMethodMain {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gm=new GenericMethod();
        /**
         * 调用含有泛型的方法genericMethod01
         * 传递什么引用类型的数据，泛型就是什么类型
         */
        Integer i = gm.genericMethod01(7485);
        Double d = gm.genericMethod01(120.023);
        String str = gm.genericMethod01("gyhuih");
        Boolean b = gm.genericMethod01(true);
        /**
         * 静态方法不需用对象，可以直接调用
         */
        Integer in = GenericMethod.genericMethod02(74185);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("hjk");
        strList.add("hjk");
        strList.add("hjk");

        String[] stringArray = strList.toArray(new String[strList.size()]);
        System.out.println(Arrays.toString(stringArray));


    }
}
