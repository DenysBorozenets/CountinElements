package com.denis;


public class Main {
    public static void main(String[] args) {

        NewList<Integer> list = new NewList<>();

        list.add(4); //4,5,-6,4,5,3,4,2,4,5,7
        list.add(5);
        list.add(-6);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);

        list.forEach(System.out::println);

        //Check methods
        list.remove(0);
        list.clear();
        list.removeRange(1,2);
        list.remove(4);

        list.forEach(System.out::println);

        NewList.count(list);
    }
}
