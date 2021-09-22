package com.denis;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class NewList<E> extends ArrayList<E> {

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
