package com.testehan.effective.chpt5Generics.item26;

import java.util.ArrayList;
import java.util.List;

/*
    The unbounded wildcard type is specified using the wildcard character (?), for example, List<?>. This is called a
    list of unknown type. There are two scenarios where an unbounded wildcard is a useful approach:
        -If you are writing a method that can be implemented using functionality provided in the Object class.
        -When the code is using methods in the generic class that don't depend on the type parameter.

!!!!!
    It's important to note that List<Object> and List<?> are not the same. You can insert an Object, or any subtype of
    Object, into a List<Object>. But you can only insert null into a List<?>.

    https://docs.oracle.com/javase/tutorial/java/generics/unboundedWildcards.html
*/

public class UnboundedWildcardType {

    public static void main(String[] args) {
        List<String> myStringList = new ArrayList();
        myStringList.add("abc");
        myStringList.add("def");

        List<Integer> myIntegerList = new ArrayList();
        myIntegerList.add(123);
        myIntegerList.add(456);

        printList(myStringList);
        printList(myIntegerList);

    }

    public static void printList(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }
}
