package com.heima.Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Nickylai
 * @version 1.0.0
 * @description
 * @time 2018/12/21 18:35
 * @see
 */
public class test {

    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<String>();
        coll.add("水立方");
        coll.add("东方明珠");
        coll.add("大雁塔");
        for (String s : coll) {
            System.out.print(s+", ");
        }

    }

}

