package com.nickylai.Demo01;

import java.util.ArrayList;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/20 8:51
 * @see
 */
public class PersonMain {
    public static void main(String[] args) {
        Person p1=new Person("小明",18);
        Person p2=new Person("小红",16);
        System.out.println(p1);
        System.out.println(p2);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        System.out.println(list);

        Person p3=new Person("王大锤",18);
        Person p4=new Person("王大锤",18);
        System.out.println(p3==p4);
        System.out.println(p3.equals(p4));



    }
}
