package com.heima.Demo03Generic;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 定义一个含有泛型的类，模拟ArrayList集合
 * 泛型是一个未知的数据类型，当我们不确定用什么类型的数据时，就是用泛型
 * 泛型可以接收任意数据类型，可以使用Integer String Person
 * 创建对象的时候将数据类型传递进来
 * @time 2018/12/21 14:19
 * @see
 */
public class GenericTest<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public GenericTest() {
    }

    public GenericTest(E name) {
        this.name = name;
    }
}
