package com.testehan.effective.chpt9General.item61;

public class Unbelievable {
    static Integer i;

    /*
        No, it doesn’t print Unbelievable—but what it does is almost as strange. It throws
        a NullPointerException when evaluating the expression i == 42. The problem is
        that i is an Integer, not an int, and like all nonconstant object reference fields, its
        initial value is null. When the program evaluates the expression i == 42, it is
        comparing an Integer to an int. In nearly every case when you mix primitives
        and boxed primitives in an operation, the boxed primitive is auto-unboxed. If
        a null object reference is auto-unboxed, you get a NullPointerException
     */
    public static void main(String[] args) {
        if (i == 42)
            System.out.println("Unbelievable");
    }
}
