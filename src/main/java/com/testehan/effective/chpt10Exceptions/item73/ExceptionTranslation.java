package com.testehan.effective.chpt10Exceptions.item73;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ExceptionTranslation<E> {

    public E get(int index) {
        ListIterator<E> i = listIterator(index);
        try {
            return i.next();
        /*
                Here is an example of exception translation taken from the
                AbstractSequentialList class, which is a skeletal implementation (Item 20) of
                the List interface. In this example, exception translation is mandated by the
                specification of the get method in the List<E> interface
         */
        } catch (NoSuchElementException e) {        // Purpose of the example :)
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }

    private ListIterator<E> listIterator(int index) {
        List<E> names = new LinkedList<>();         // dummy implementation...not the purpose of the example
        return names.listIterator();
    }
}
