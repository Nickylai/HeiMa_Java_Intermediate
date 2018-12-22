package com.heima.Task;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description一、给定以下代码，
 * 请定义方法public static int listTest(Collection<String> list,String s)
 * 统计集合中指定元素出现的次数，如"a":2,"b": 2,"c" :1, "xxx":0。
 * 		Collection<String> list = new ArrayList<>();
 * 			list.add("a");
 * 			list.add("a");
 * 			list.add("b");
 * 			list.add("b");
 * 			list.add("c");
 * 			System.out.println("a:"+listTest(list, "a"));
 * 			System.out.println("b:"+listTest(list, "b"));
 * 			System.out.println("c:"+listTest(list, "c"));
 * 			System.out.println("xxx:"+listTest(list, "xxx"));
 * @time 2018/12/21 16:57
 * @see
 */
public class Task01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
 			list.add("a");
 			list.add("a");
  			list.add("b");
 			list.add("b");
  			list.add("c");
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
 		System.out.println("c:"+listTest(list, "c"));
    }
    public static int listTest(Collection<String> list, String s){
        int a=0;
        for (String s1 : list) {
            if (s1.equals(s)){
                a++;
            }
        }

        return a;
    }
}
