package it.cast.ReviewTest.Test02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 二、现在有一个map集合如下：
 * Map<Integer,String> map = new HashMap<Integer, String>();
 *         map.put(1, "张三丰");
 *         map.put(2, "周芷若");
 *         map.put(3, "汪峰");
 *         map.put(4, "灭绝师太");
 * 要求：
 * 1.遍历集合，并将序号与对应人名打印。
 * 2.向该map集合中插入一个编码为5姓名为李晓红的信息
 * 	3.移除该map中的编号为1的信息
 * 	4.将map集合中编号为2的姓名信息修改为"周林"
 * @time 2018/12/24 15:22
 * @see
 */
public class Test02 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map = new HashMap<>();
            map.put(1, "张三丰");
            map.put(2, "周芷若");
            map.put(3, "汪峰");
            map.put(4, "灭绝师太");
        String s = "bug";
            //遍历集合，并将序号与对应人名打印。
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());

        }

        //2.向该map集合中插入一个编码为5姓名为李晓红的信息
        map.put(5, "李晓红");

        //3.移除该map中的编号为1的信息
        map.remove(1);

        //4.将map集合中编号为2的姓名信息修改为"周林"
        map.put(2, "周林");

        System.out.println(map);
    }
}
