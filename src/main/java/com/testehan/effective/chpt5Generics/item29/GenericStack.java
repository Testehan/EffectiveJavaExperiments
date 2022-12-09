package com.testehan.effective.chpt5Generics.item29;

import java.util.Arrays;
import java.util.EmptyStackException;

public class GenericStack<E> {

    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings({"unchecked"}) // see reasons below.. type of the array won't be E[]; it will always be Object[]!
    public GenericStack() {
//        elements = new E[DEFAULT_INITIAL_CAPACITY];   doesn't compile

            /*
                The bellow usage is legal, but it’s not (in general) typesafe
                The compiler may not be able to prove that your program is typesafe, but you
                can. You must convince yourself that the unchecked cast will not compromise the
                type safety of the program. The array in question (elements) is stored in a private
                field and never returned to the client or passed to any other method. The only
                elements stored in the array are those passed to the push method, which are of
                type E, so the unchecked cast can do no harm.
                Once you’ve proved that an unchecked cast is safe, suppress the warning in as
                narrow a scope as possible (Item 27)
             */
            elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }
    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        E result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
