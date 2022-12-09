package com.testehan.effective.chpt5Generics.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T> {
    private final List<T> choiceList;           // in the book, the author tries to write this class using a generics array
                                                // obviously he runs into all sorts of issues and so switches to List instead
    public Chooser(Collection<T> choices) {
        choiceList = new ArrayList<>(choices);
    }

    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);
        List<String> stringList = List.of("a","b","c");

        Chooser<Integer> chooser = new Chooser<>(intList);
        Chooser<String> chooser2 = new Chooser<>(stringList);

        for (int i = 0; i < 3; i++) {
            Number choice = chooser.choose();
            String choice2 = chooser2.choose();
            System.out.println(choice + " " + choice2);
        }
    }
}