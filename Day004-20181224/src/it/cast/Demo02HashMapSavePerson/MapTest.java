package it.cast.Demo02HashMapSavePerson;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/24 14:24
 * @see
 */
public class MapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String  str=scanner.next();
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (Character key : chars) {
            if (map.containsKey(key)){
                Integer value=map.get(key);
                value++;
                map.put(key,value);
            }else {
                map.put(key, 1);
            }
        }
        for (Character character : map.keySet()) {
            System.out.println(character + "=" + map.get(character));
        }
        System.out.println(map.containsKey('h'));
    }
}
