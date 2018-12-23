package com.heima.ClassroomTest;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/23 15:28
 * @see
 */
public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("r");
        list.add("a");
        list.add("ab");
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.addAll(list);

        for (String s : set) {
            System.out.println(s.toUpperCase());

        }
    }
}
