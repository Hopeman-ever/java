package com.zzl.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01 {
    public static void main(String[] args) {
//       ArrayList<person> list = new ArrayList<>();
//       list.add(new person("张志立", 12));
//       list.add(new person("檀亚诚",22));
//       System.out.println(list);
//       Collections.sort(list);
//       System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,5,3,7,4);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list);
    }
}
