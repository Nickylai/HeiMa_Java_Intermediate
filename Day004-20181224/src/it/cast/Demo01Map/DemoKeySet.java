package it.cast.Demo01Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * Map 的遍历
 *      1.通过键来找值
 *      Set<K> keySet() 返回此映射中包含的键的Set集合
 *       实现步骤
 *       1使用map集合的方法keySet()方法，把Map集合所有的可以取出来，存储到一个Set集合中
 *       通过Map集合的方法getkey()方法，找到Mao集合中键对应的元素
 *
 *      2.通过Entry对象遍历
 *       Set<Map.Entry<k,V>> entrySet(),返回映射中的Entry的Set集合
 *
 * @time 2018/12/24 9:55
 * @see
 */
public class DemoKeySet {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("赵丽颖", 158);
        map1.put("杨颖", 160);
        map1.put("杨幂", 165);
        map1.put("凌志玲", 172);
        System.out.println("遍历一次！");
        for (String k : map1.keySet()) {
            Integer value = map1.get(k);
            System.out.println(k+"="+value);
        }
        System.out.println("身高小于170：");
        for (String key : map1.keySet()) {
            Integer value = map1.get(key);
            if (value<170){
                System.out.print(key+" ");
            }
        }

        System.out.println("\n====================");
        System.out.println("使用entry对象进行第一次遍历");
        Set<Map.Entry<String, Integer>> entrySet = map1.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println("使用entry对象进行第二次遍历");
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println("使用entry对象进行第三次遍历，按条件挑选数据");
        System.out.println("身高小于170： ");
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue()<170){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
