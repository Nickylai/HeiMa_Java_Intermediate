package com.heima.ClassroomTest;

import java.util.ArrayList;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/23 15:52
 * @see
 */
public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        addall(list,"gh","d","fghkf","415","fgyuh");
        System.out.println(list);

    }
    public static void addall(ArrayList<String>list,String...s){
        for (String s1 : s) {
            list.add(s1);
        }
    }
}

