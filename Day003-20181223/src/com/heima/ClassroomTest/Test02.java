package com.heima.ClassroomTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/23 10:10
 * @see
 */
public class Test02 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        //在第一个元素前面添加D
        list.add(0, "d");
        System.out.println(list);
        //移除最后一个元素
        list.remove(list.size() - 1);
        System.out.println(list);
        //将集合中的元素改为大写
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            list.set(i, s.toUpperCase());
        }
        System.out.println(list);
    }
}
