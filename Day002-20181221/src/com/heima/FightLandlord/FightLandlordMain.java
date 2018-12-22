package com.heima.FightLandlord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * 斗地主的主方法入口，完成洗牌、发牌阶段,最后显示玩家的手牌和底牌
 *
 * @time 2018/12/21 16:17
 * @see
 */
public class FightLandlordMain {
    public static void main(String[] args) {
        /**
         * 准备一副牌
         * 定义一个ArrayList数组，泛型使用String
         */
        ArrayList<String> poker = new ArrayList<>();

        //定义两个数组，一个存储花色，一个存储牌的数字
        String[] colors = {"♣", "♡", "♢", "♤"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        //添加大小王poker数组中
        poker.add("大王☠");
        poker.add("小王☺");
        //组合花色与数字，添加到poker数组中
        for (String num : numbers) {
            for (String co : colors) {
                poker.add(co + num);
            }
        }

        //洗牌
        Collections.shuffle(poker);

        /**
         * 发牌，定义4个集合，存储玩家的牌和底牌
         */
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> lastpoker = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌的牌面
            String str = poker.get(i);
            if (i>=51){
                lastpoker.add(str);
            }else if (i%3==0){
                player01.add(str);
            }else if (i%3==1){
                player02.add(str);
            }else if (i%3==2){
                player03.add(str);
            }
        }

        //看牌
        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);
        System.out.println(lastpoker);

    }
}
