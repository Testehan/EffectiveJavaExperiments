package com.testehan.effective.chpt5Generics.item28;

public class ArrayVsList {

    public static void main(String[] args) {
        Object[] objectArray = new Long[1];
        objectArray[0] = "I don't fit in";      // fails at runtime


        // Won't compile!
//        List<Object> ol = new ArrayList<Long>(); // Incompatible types
//        ol.add("I don't fit in");
    }
}
