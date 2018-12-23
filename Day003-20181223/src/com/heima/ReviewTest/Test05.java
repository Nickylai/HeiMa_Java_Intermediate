package com.heima.ReviewTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 五、双色球规则：
 * 双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 * 红色球号码从1—33中选择；蓝色球号码从1—16中选择；
 * 请随机生成一注双色球号码。（要求同色号码不重复）
 * @time 2018/12/23 19:37
 * @see
 */
public class Test05 {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        Random r = new Random();
        while (integers.size()<6){
            int a=r.nextInt(33)+1;
            integers.add(a);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(integers);
        int b=r.nextInt(16)+1;
        list.add(b);
        System.out.println(list);
    }
}
