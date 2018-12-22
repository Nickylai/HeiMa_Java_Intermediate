package com.heima.Demo04GenericInterface;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/21 15:32
 * @see
 */
public class GenericInterfaceImpl02<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
