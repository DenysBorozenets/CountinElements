package com.denis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.UnaryOperator;

public class NewList<E> extends ArrayList<E> {

    private static Map<Integer, Integer> map;
    private List<Integer> list = new ArrayList<>();

    public static void count(List<Integer> list) {
        map = new TreeMap<>();
        for (Integer i:list) {
            if (!map.containsKey(i)) {
                map.put(i,1);
            } else {
                map.replace(i, map.get(i).intValue()+1);
            }
        }

        for (Map.Entry m:map.entrySet()) {
            System.out.print(m.getKey());
            System.out.print(" - ");
            System.out.println(m.getValue());
        }
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
