package com.testehan.effective.chpt8Methods.item52;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
    The confusing behavior demonstrated by the previous example came about because the List<E> interface has two
    overloadings of the remove method:
        remove(E) and remove(int).
*/

public class SetList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        System.out.println(set + " " + list);
        for (int i = 0; i < 3; i++) {
            set.remove(i);          // this removed the object coresponding to i, meaning actual values
            list.remove(i);         // this removed the objects that were at the index i..hence the difference in results
//            list.remove(Integer.valueOf(i));        // this fixes the problem, because a different remove method, that has Object as
                                                    // parameter will be called, not the one that has the primite int index
        }
        System.out.println(set + " " + list);
    }
}
