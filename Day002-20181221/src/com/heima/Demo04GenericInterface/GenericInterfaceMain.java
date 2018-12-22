package com.heima.Demo04GenericInterface;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/21 15:36
 * @see
 */
public class GenericInterfaceMain {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl01对象
        GenericInterfaceImpl01 gc01=new GenericInterfaceImpl01();
        gc01.method("gihoj");

        //创建GenericInterfaceImpl02对象
        GenericInterfaceImpl02<Integer> gc02=new GenericInterfaceImpl02<>();
        gc02.method(7485);

        GenericInterfaceImpl02<Double> gc03=new GenericInterfaceImpl02<>();
        gc03.method(12.02);


    }
}
