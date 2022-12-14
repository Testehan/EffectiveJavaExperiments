package com.testehan.effective.chpt8Methods.item52.overriding;

import java.util.List;

/*
    The name method is declared in class Wine and overridden in subclasses
    SparklingWine and Champagne. As you would expect, this program prints out
    wine, sparkling wine, and champagne, even though the compile-time type of the
    instance is Wine in each iteration of the loop. The compile-time type of an object
    has no effect on which method is executed when an overridden method is invoked;
    the “most specific” overriding method always gets executed.

    Compare this to overloading, where the runtime type of an object has no effect on which overloading is executed;
    the selection is made at compile time, based entirely on the compile-time types of the parameters.
        see @CollectionClassifier for the overloading example
*/

public class Overriding {

    public static void main(String[] args) {
        List<Wine> wineList = List.of(new Wine(), new SparklingWine(), new Champagne());
        for (Wine wine : wineList)
            System.out.println(wine.name());
    }
}
