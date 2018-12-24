package it.cast.ReviewTest.Test01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 一、请使用Map集合存储自定义数据类型Car做键，
 * 对应的价格做值。
 * 并使用keySet和entrySet两种方式遍历Map集合
 * @time 2018/12/24 14:46
 * @see
 */
public class Test01 {
    public static void main(String[] args) {

        Car bmw = new Car("BMW:X3", 288563);
        Car mercedesBenz = new Car("MercedesBenz:C-class", 295500);
        Car audi = new Car("Audi:A4", 253450);
        Car volvo = new Car("Volvo:S90", 385500);
        Map<Car, Integer> map = new HashMap<>();
        map.put(bmw, bmw.getPrice());
        map.put(mercedesBenz, mercedesBenz.getPrice());
        map.put(audi, audi.getPrice());
        map.put(volvo, volvo.getPrice());
        for (Map.Entry<Car, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"售价:--->"+entry.getValue());
        }
        System.out.println("================================");
        for (Car key : map.keySet()) {
            System.out.println(key+"售价："+map.get(key));

        }
    }
}
