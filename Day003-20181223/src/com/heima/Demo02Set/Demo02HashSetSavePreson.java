package com.heima.Demo02Set;

import java.util.HashSet;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/23 14:46
 * @see
 */
public class Demo02HashSetSavePreson {
    public static void main(String[] args) {
        //创建HashSet 集合存储Preson对象
        HashSet<Preson> set = new HashSet<>();

        Preson p1 = new Preson("小美女",18 );
        Preson p2 = new Preson("小美女",18 );
        Preson p3 = new Preson("小美女",19 );

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1==p3);
        System.out.println(p1.equals(p2));

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set);


    }
}
