package com.heima.ClassroomTest;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/23 11:15
 * @see
 */
public class Test04 {
    public static void main(String[] args) {
        //创建LinkedList对象存储元素
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("abc");
        linkedList.add("abc");
        linkedList.addLast("重地");
        linkedList.addLast("通话");
        linkedList.addFirst("xyz");
        linkedList.addFirst("xyz");
        System.out.println(linkedList);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i)+" "+linkedList.get(i).hashCode()+" "+linkedList.get(i).toString());

        }

        //去重复
        HashSet<String> set = new HashSet<>();
        set.addAll(linkedList);
        System.out.println(set);

        linkedList.clear();
        linkedList.addAll(set);
        System.out.println(linkedList);
    }
}
