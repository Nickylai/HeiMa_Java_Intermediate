package it.cast.Demo01Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/24 8:45
 * @see
 */
public class DemoMap {
    public static void main(String[] args) {

        method01();
        method02();
    }

    /**
     * public V put(K key,V value):把指定元素的键和指定的值添加到Map集合中
     * 返回值：V
     *      存储值对的时候，key不重复，返回值V是null
     *      存储键值对的时候，key重复，会使用新的Value替map中重复的value，返回被替换的value值
     */
    public static void method01(){
        //创建Map集合对象，多态形式,指向HashMap
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("李晨", "范冰冰1");
        System.out.println("v1:"+v1);
        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("v2:"+v2);
        System.out.println(map);
        map.put("小明", "小红");
        map.put("小王", "小玉");
        map.put("小李", "小玉");
        System.out.println(map);
    }

    public static void method02(){
//        Map<String, Integer> map = new HashMap<>();
//        map.put("赵丽颖", 158);
//        map.put("杨颖", 160);
//        map.put("杨幂", 165);
//        map.put("凌志玲", 172);
//        System.out.println(map);
    }
}
