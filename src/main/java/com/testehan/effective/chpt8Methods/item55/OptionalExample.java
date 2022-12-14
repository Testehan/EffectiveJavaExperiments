package com.testehan.effective.chpt8Methods.item55;

import java.util.*;

public class OptionalExample {

    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
        if (c.isEmpty())
            return Optional.empty();

        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        return Optional.of(result);
    }


    // Returns max val in collection as Optional<E> - uses stream
    public static <E extends Comparable<E>> Optional<E> max2(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        /*
            Returning an optional that contains a boxed primitive type is prohibitively
            expensive compared to returning a primitive type because the optional has two
            levels of boxing instead of zero
         */
        int x = 123; // Don't use Optional<Integer> ...use this :
        OptionalInt optionalInt =  OptionalInt.of(x);
        OptionalDouble optionalDouble = OptionalDouble.of(x);
        OptionalLong optionalLong = OptionalLong.of(x);


        optionalInt.orElse(100);
    }
}
