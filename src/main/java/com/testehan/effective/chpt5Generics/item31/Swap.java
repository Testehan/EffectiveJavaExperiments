package com.testehan.effective.chpt5Generics.item31;

import java.util.Arrays;
import java.util.List;

public class Swap {
    // method that swaps i and j elements with each other
    public static void swap(List<?> list, int i, int j) {

//        list.set(i, list.set(j, list.get(i))); // The problem is that the type of list is List<?>, and you can’t put
                                                // any value except null into a List<?>

        swapHelper(list, i, j); // solution is to use this private helper method that captures the type
    }

    // Private helper method for wildcard capture
    // Clients of the swap method don’t have to confront the more complex swapHelper declaration, but
    // they do benefit from it. It is worth noting that the helper method has precisely the
    // signature that we dismissed as too complex for the public method
    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {
        List<Integer> listToTest = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        swap(listToTest, 0, listToTest.size() - 1);
        System.out.println(listToTest);
    }
}
