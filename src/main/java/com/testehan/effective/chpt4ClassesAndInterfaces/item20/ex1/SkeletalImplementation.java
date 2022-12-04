package com.testehan.effective.chpt4ClassesAndInterfaces.item20.ex1;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class SkeletalImplementation {

    // Concrete implementation built atop skeletal implementation
    public static List<Integer> intArrayAsList(int[] a) {
        Objects.requireNonNull(a);
        // The diamond operator is only legal here in Java 9 and later
        // If you're using an earlier release, specify <Integer>
        return new AbstractList<>() {
            @Override public Integer get(int i) {
                return a[i]; // Autoboxing (Item 6)
            }
            @Override public Integer set(int i, Integer val) {
                int oldVal = a[i];
                a[i] = val; // Auto-unboxing
                return oldVal; // Autoboxing
            }
            @Override public int size() {
                return a.length;
            }
        };
    }

    public static void main(String[] args) {
        int[] array = {1, 2 ,3 ,4 ,5 ,6};
        List<Integer> list = intArrayAsList(array);
        System.out.println(list);
    }
}
