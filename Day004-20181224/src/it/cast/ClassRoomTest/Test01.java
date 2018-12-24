package it.cast.ClassRoomTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/24 9:45
 * @see
 */
public class Test01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        //增加
        map.put(1, "璋三");
        map.put(2, "里斯");
        map.put(3, "汪芜");
        map.put(4, "昭柳");
        map.put(5, "天骐");
        System.out.println(map);

        //改
        map.put(5, "张琪");
        System.out.println(map);

        //删除
        map.remove(1);
        System.out.println(map);

        //查
        if (map.containsKey(3)){
            map.put(3, "小明");
        }
        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map);
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
