package it.cast.Demo03Test;

import java.util.*;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/24 15:56
 * @see
 */
public class FightLandlord {
    public static void main(String[] args) {
        Map<Integer, String> pork = new HashMap<>();

        ArrayList<Integer> porkIndex = new ArrayList<>();

        List<String> colors = List.of("♤", "♡", "♧", "♢");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9",
                "8", "7", "6", "5", "4", "3");

        int index=0;
        pork.put(index, "大王☠");
        porkIndex.add(index);
        pork.put(++index, "小王☺");
        porkIndex.add(index);

        for (String number : numbers) {
            for (String color : colors) {
                index++;
                pork.put(index, color + number);
                porkIndex.add(index);
            }
        }

//        System.out.println(pork);
//        System.out.println(porkIndex);

        Collections.shuffle(porkIndex);
//        System.out.println(porkIndex);

//        for (Integer it : porkIndex) {
//            System.out.print(pork.get(it)+" ");
//        }
//        System.out.println(porkIndex.size());
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> lastPork = new ArrayList<>();

        for (int i = 0; i < porkIndex.size(); i++) {
            Integer in = porkIndex.get(i);
            if (i>=51){
                lastPork.add(in);
            }else if(i%3==0){
                player01.add(in);
            }else if(i%3==1){
                player02.add(in);
            }else if(i%3==2){
                player03.add(in);
            }
        }
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(lastPork);

        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);
        System.out.println(lastPork);

        System.out.println("底牌：");
        for (Integer it : lastPork) {
            System.out.print(pork.get(it)+" ");
        }

        System.out.println("\n 玩家三的牌：");
        for (Integer it : player03) {
            System.out.print(pork.get(it)+" ");
        }

        System.out.println("\n玩家二的牌： ");
        for (Integer it : player02) {
            System.out.print(pork.get(it)+" ");
        }

        System.out.println("\n玩家一的牌： ");
        for (Integer it : player01) {
            System.out.print(pork.get(it)+" ");
        }
    }
}
