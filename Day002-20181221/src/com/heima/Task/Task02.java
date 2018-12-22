package com.heima.Task;

import java.util.ArrayList;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 二、定义一个方法listTest(ArrayList<Integer> al, Integer s)，
 * 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
 * @time 2018/12/21 17:28
 * @see
 */
public class Task02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(852);
        list.add(25);
        list.add(52);
        list.add(592);
        Task02 task02 = new Task02();
        int a = task02.listTest(list, 52);
        System.out.println(a);
    }

    public int listTest(ArrayList<Integer> al, Integer s) {
        int a = 0;
        for (int i = 0; i < al.size(); i++) {
            if (s == al.get(i)) {
                a = i;
                break;
            } else {
                a = -1;
            }
        }

        return a;
    }
}
