package com.denis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class NewList<E> extends ArrayList<E> {

    public static void count(List<Integer> list) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (Integer i:list) {
            if (!map.containsKey(i)) {
                map.put(i,1);
            } else {
                map.replace(i, map.get(i) +1);
            }
        }

        for (Map.Entry m:map.entrySet()) {
            System.out.print(m.getKey());
            System.out.print(" - ");
            System.out.println(m.getValue());
        }
    }

    public static Map<Object, Long> lambdaCount(List<Integer> list) {
          return list.stream().collect(Collectors.groupingBy(e ->e, Collectors.counting()));
    }

    @Override
    public E remove(int index) {
        System.out.println("You can`t remove");
        return null;
    }

    @Override
    public void clear() {
        System.out.println("You cant do this action");
    }

    @Override
    public void removeRange(int from, int to){
        System.out.println("You can`t do this");
    }

    @Override
    public boolean remove(Object o) {
        System.out.println("You cant do this");
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<E> op){
        System.out.println("You cant do this");
    }
}
