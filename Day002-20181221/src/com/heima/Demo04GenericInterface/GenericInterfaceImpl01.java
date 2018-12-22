package com.heima.Demo04GenericInterface;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/21 15:31
 * @see
 */
public class GenericInterfaceImpl01 implements GenericInterface<String> {

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
