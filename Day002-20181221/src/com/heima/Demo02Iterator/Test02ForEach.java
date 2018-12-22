package com.heima.Demo02Iterator;

import com.heima.Demo01Collection.Test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 增强for循环，使用for循环的格式，简化了迭代器的书写
 * @time 2018/12/21 11:03
 * @see
 */
public class Test02ForEach {
    public static void main(String[] args) {
        Test02ForEach test02ForEach=new Test02ForEach();
        test02ForEach.method01();
        test02ForEach.method02();
    }
    public void method01(){
        List<String> list = new ArrayList<>();
        list.add("ajhu");
        list.add("ajhu");
        list.add("ajhu");
        list.add("ajhu");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s =  it.next();
            System.out.println(s);

        }
        System.out.println("-----------------");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");
        System.out.println(list);
        String string=list.toString();
        System.out.println(string);
    }
    public void method02(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("-----------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
