package com.heima.Demo03Generic;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/21 14:25
 * @see
 */
public class GenericMain {
    public static void main(String[] args) {
        //不写泛型，默认为Object类型
        GenericTest gc = new GenericTest();
        gc.setName("ghuioj");
        System.out.println(gc.getName());

        //创建对象，泛型使用Integer类型
        GenericTest<Integer> gcInteger = new GenericTest();
        gcInteger.setName(741);
        System.out.println(gcInteger.getName());

        //创建对象，泛型使用String类型
        GenericTest gcString  = new GenericTest();
        gcString.setName("ghuioj");
        System.out.println(gcString.getName());
    }
}
