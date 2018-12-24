package it.cast.Demo02HashMapSavePerson;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * Hash存储自定义类型的键值
 *      类里面必须重写equals和hashcode方法
 * @time 2018/12/24 10:57
 * @see
 */
public class DemoHashMapSavePerson {
    public static void main(String[] args) {
        show01();
        System.out.println("============================================");
        show02();
    }

    public static void show02(){
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("秦始皇", 2000), "秦国");
        map.put(new Person("女王", 18), "英国");
        map.put(new Person("普京", 60), "俄罗斯");
        map.put(new Person("女王", 19), "英联邦");
        //使用entry遍历集合打印
        for (Map.Entry<Person, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":------->"+entry.getValue());
        }

    }

    public static void show01(){
        //创建HashMap集合
        Map<String, Person> map = new HashMap<>();
        map.put("北京", new Person("张三", 18));
        map.put("上海", new Person("李四", 19));
        map.put("杭州", new Person("王五", 20));
        map.put("深圳", new Person("赵柳", 21));
        //遍历集合
        for (String key : map.keySet()) {
            Person value = map.get(key);
            System.out.println(value);
        }
    }
    
    
}
