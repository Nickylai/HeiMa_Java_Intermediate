package com.heima.Demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * list 接口特点
 *  有序集合
 *  有索引
 *  允许存储重复元素
 * @time 2018/12/23 9:10
 * @see
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //使用add方法添加元素
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");

        System.out.println(list);

        //添加元素到指定位置
        list.add(3, "heima");
        System.out.println(list);

        //移除指定位置的元素
        String remove = list.remove(2);
        list.remove("a");
        System.out.println("被删除的元素："+remove);
        System.out.println(list);

        //替换指定位置的元素
        String ghj = list.set(4, "ghj");
        System.out.println("被替换的元素："+ghj);
        System.out.println(list);

        //list的遍历方式
        //for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s+" ");
        }
        System.out.println("---------------------");

        //使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next =  it.next();
            System.out.println(next);
        }

        //增强for循环
        for (String s : list) {
            System.out.println(s);
        }
    }
}
