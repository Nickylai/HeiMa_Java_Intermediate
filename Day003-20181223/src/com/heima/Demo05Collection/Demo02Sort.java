package com.heima.Demo05Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/23 16:20
 * @see
 */
public class Demo02Sort {
    public static void main(String[] args) {
        List<String> arr=new ArrayList<String>();

        arr.add("java");

        arr.add("world");

        arr.add("hello");

        arr.add("java");

        arr.remove("java");

        System.out.println(arr.contains("java"));

        ArrayList<Integer> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list, 11,782, 5, 3, 4, 8);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "ghjk", "ghj", "yhn", "agag");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        ArrayList<Preson> list2 = new ArrayList<>();
        list2.add(new Preson("小美女", 18));
        list2.add(new Preson("大美女", 28));
        list2.add(new Preson("小明", 8));
        list2.add(new Preson("小红", 9));
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
    }

}
