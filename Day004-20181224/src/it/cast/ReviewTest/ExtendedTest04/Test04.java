package it.cast.ReviewTest.ExtendedTest04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 四、定义一个泛型为String类型的 List集合，
 * 统计该集合中每个字符（注意，不是字符串）出现的次数。
 * 例如：集合中有”abc”、”bcd”两个元素，
 * 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 * @time 2018/12/24 19:12
 * @see
 */
public class Test04 {
    public static void main(String[] args) {
        //创建一个List对象，list
        List<String> list = new ArrayList<>();
        //添加一系列随机字符串
        list.add("abcbcaikmrtghjkloiuytresxcvbnmbab");
        list.add("cbabcrtyuijhgfdertyuikjnhbgba");
        list.add("cnedrtfyguhixecfvgybhnusssssghjuytrdcgvuhbjnkmygftcbcbahb");

        //创建一个HashMap 泛型为<Character,Integer>,命名为map
        Map<Character, Integer> map = new HashMap<>();
        //增强for遍历list数组，将结果赋予字符串s
        for (String s : list) {
            //运用String类的toCharArray方法，将字符串s转换为char数组，赋予给字符数组对象chars
            char[]chars=s.toCharArray();
            //运用增强for，遍历chars数组，将数组的每一个字符，赋值给char c
            for (char c : chars) {
                //判断map集合中是否包含字符c，这个值得key
                if (map.containsKey(c)) {
                    //如果map集合中含有c值得key，则将该键值的value+1
                    map.put(c, map.get(c) + 1);
                }else {//如果map中没有c值得key，则向map中添加c值得key，赋值value为1
                    map.put(c, 1);
                }
            }
        }
        //定义一个str字符串用于接收map的遍历结果
        String str="";
        //增强for遍历map，运用entrySet方法
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            //将遍历获得键值对，拼接到str字符串中
           str+=(entry.getKey()+" = "+entry.getValue()+",");
        }
        //打印输出str，将字符串的最后两个字符去掉
        System.out.println(str.substring(0,str.length()-1));
    }
}
