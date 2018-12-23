package com.heima.Demo02Set;

import java.util.HashSet;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * set 集合不允许存储重复元素的原理
 * 1.集合在调用add方法时，会调用元素的HashCode方法，判断hash值是否重复，不重复直接存储
 * 2.hash值一样，会调用equals方法，返回true，则认定两个元素相同，不存储元素；
 *      返回false认定元素不同，存储元素到Hash数组的同一个位置下面
 * 3.同一个hash值数组位置，存储元素小于8，采用链表结构，当存储元素大于等于8时，采用红黑树结构存储元素
 *
 * @time 2018/12/23 14:24
 * @see
 */
public class Demo02HashSet {
    public static void main(String[] args) {
        // new HashSet's object
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");

        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");

    }
}
