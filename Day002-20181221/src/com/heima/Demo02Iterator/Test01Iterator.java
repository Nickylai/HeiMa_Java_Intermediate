package com.heima.Demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * Iterator迭代器，
 * boolean hasNest(),判断是否到达集合的末尾，是返回true，否返回false
 * E next()，取出集合中的元素
 *
 * @time 2018/12/21 9:52
 * @see
 */
public class Test01Iterator {
    public static void main(String[] args) {

        Test01Iterator test01Iterator = new Test01Iterator();
//      test01Iterator.iteratorTest();
        test01Iterator.iteratorTest02();

    }
    public void iteratorTest02(){
        Collection<Person> collection = new ArrayList();
        ((ArrayList) collection).add(new Person("小明1",18));
        ((ArrayList) collection).add(new Person("小明2",28));
        ((ArrayList) collection).add(new Person("小明3",38));
        ((ArrayList) collection).add(new Person("小明4",48));
        ((ArrayList) collection).add(new Person("小明5",58));
        Iterator<Person> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Person next =  iterator.next();
            System.out.println(next);
        }


    }


    public void iteratorTest(){
        //创建一个collection集合对象list
        ArrayList<String> list = new ArrayList<>();
        //向集合中添加5个元素
        list.add("张三");
        list.add("李四");
        list.add("王麻子");
        list.add("刘亦菲");
        list.add("迪丽热巴");
        //获取list集合的迭代器
        Iterator<String> it1 = list.iterator();//new Itr()
        //判断集合是否有下一个元素需要获取
        boolean b=it1.hasNext();
        System.out.println(b);
        //无限循环，取出下一个元素并打印
        //快捷键 连续两个it+回车 itit+enter

        while (it1.hasNext()){
            String str=it1.next();
            System.out.println(str);
        }
        System.out.println(list);
    }
}
