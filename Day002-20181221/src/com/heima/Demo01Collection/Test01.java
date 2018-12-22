package com.heima.Demo01Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 键盘无限录入字符串存入集合，若果集合中包含字符串
 * 则删除这个字符串，如果不包含，则存入这个字符串，当集合长度为5时，
 * 结束循环，最后打印集合，然后清空集合。
 * @time 2018/12/21 9:11
 * @see
 */
public class Test01 {
    public static void main(String[] args) {

        Test01 test=new Test01();
        test.inputString();
    }
    public void inputString(){
        Scanner sc = new Scanner(System.in);
        Collection<String> list = new ArrayList<>();
        while (true){
            System.out.println("输入一个随机字符串：");
            String str=sc.next();
            if (list.contains(str)){
                System.out.println("集合中已包含"+str+"我们将它删除了");
                list.remove(str);
                System.out.println("现在集合中元素有\n"+list);
            }else {
               list.add(str);
                System.out.println("现在集合中元素有\n"+list);
            }
            if (list.size()==5){
                System.out.println("集合中已有5个元素");
                break;
            }
        }
        list.clear();
        if (list.isEmpty()){
            System.out.println("游戏结束，集合已被清空！\n"+list);
        }

    }
}
