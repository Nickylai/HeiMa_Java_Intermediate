package it.cast.ReviewTest.Test03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 三、有2个数组，
 * 第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
 * 第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
 * 将第一个数组元素作为key，
 * 第二个数组元素作为value存储到Map集合中。
 * 如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
 * @time 2018/12/24 16:12
 * @see
 */
public class Test03 {
    public static void main(String[] args) {

        String[]strings={"黑龙江省","浙江省","江西省","广东省","福建省"};

        String []strings1={"哈尔滨","杭州","南昌","广州","福州"};

        HashMap<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < strings.length; i++) {
                map.put(strings[i], strings1[i]);
        }
        System.out.println(map);
    }
}
