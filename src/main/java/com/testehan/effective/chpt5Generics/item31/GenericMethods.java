package com.testehan.effective.chpt5Generics.item31;

import java.util.*;

public class GenericMethods<E> {

    // Both parameters, s1 and s2, are E producers, so the PECS mnemonic tells us that
    //the declaration should be as follows (changed from E to ? extends E):
    public static <E> Set<E> unionGeneric(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }


    // Comparables are always consumers, so you should generally use Comparable<? super T> in preference to
    // Comparable<T>. The same is true of comparators; therefore, you should generally
    // use Comparator<? super T> in preference to Comparator<T>.
    // the wildcard is required to support types that do not implement Comparable (or Comparator)
    // directly but extend a type that does.
    public static <E extends Comparable<? super E>> E max(Collection<? extends E> c) {
        if (c.isEmpty())
            throw new IllegalArgumentException("Empty collection");
        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        return result;
    }

    public static void main(String[] args) {

        Set<Integer> integers = Set.of(1, 3, 5);
        Set<Double> doubles = Set.of(2.0, 4.0, 6.0);
        Set<Number> numbers = unionGeneric(integers, doubles);
        // Explicit type parameter - required prior to Java 8
//        Set<Number> numbers1 = GenericMethods.<Number>unionGeneric(integers, doubles);

        System.out.println(numbers);

        System.out.println(max(Set.of(3,5,2,1,7,8,10,100)));
    }
}
