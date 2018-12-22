package com.heima.TaskExtended02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 四、产生10个1-100的随机数，并放到一个数组中，
 * 把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
 * @time 2018/12/21 18:41
 * @see
 */
public class ExtendedMain02 {
    public static void main(String[] args) {
        Random r=new Random();
        int[] arr01 = new int[10];
        for (int i = 0; i < arr01.length; i++) {
            arr01[i]=r.nextInt(99)+1;
        }
        System.out.println(Arrays.toString(arr01));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i]>=10){
                list.add(arr01[i]);
            }
        }
        System.out.println(list);
    }
}
