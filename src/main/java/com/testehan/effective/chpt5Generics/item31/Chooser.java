package com.testehan.effective.chpt5Generics.item31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T> {
    private final List<T> choiceList;
    public Chooser(Collection<? extends T> choices) {
        choiceList = new ArrayList<>(choices);
    }
        // difference from item28 Chooser class is that we use "? extends T"
        // Suppose you have a List<Integer>, and you want to pass it in to the constructor
        // for a Chooser<Number>. This would not compile with the original declaration, but
        // it does once you add the bounded wildcard type to the declaration  (see main)

    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);
        Chooser<Number> chooser = new Chooser<>(intList);

        for (int i = 0; i < 3; i++) {
            Number choice = chooser.choose();
            System.out.println(choice);
        }
    }
}