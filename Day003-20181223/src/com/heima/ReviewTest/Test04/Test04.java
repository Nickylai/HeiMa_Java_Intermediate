package com.heima.ReviewTest.Test04;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 四、键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，
 * 必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。
 * @time 2018/12/23 19:26
 * @see
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.println("输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char[] chars =str.toCharArray();
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            characters.add(chars[i]);
        }
        char[] chars1 = new char[characters.size()];
        int i=0;
        for (Character c : characters) {
            chars1[i]=c;
            i++;
        }
        for (int i1 = 0; i1 < chars1.length; i1++) {
            System.out.print(chars1[i1]);
        }
    }
}
