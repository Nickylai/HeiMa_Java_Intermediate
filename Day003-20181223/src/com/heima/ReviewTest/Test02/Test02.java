package com.heima.ReviewTest.Test02;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 二、使用LinkedHashSet存储以下元素：
 * "王昭君","王昭君","西施","杨玉环","貂蝉"。
 * 使用迭代器和增强for循环遍历LinkedHashSet。
 * @time 2018/12/23 19:18
 * @see
 */
public class Test02 {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<String>();
        strings.add("王昭君");
        strings.add("王昭君");
        strings.add("西施");
        strings.add("杨玉环");
        strings.add("貂蝉");

        Iterator<String> it = strings.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }

    }
}
