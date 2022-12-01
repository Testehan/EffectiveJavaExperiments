package com.testehan.effective.chpt3MethodsCommonToObjects.item14;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

public class PhoneNumber implements Comparable<PhoneNumber>{
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix   = prefix;
        this.lineNum  = lineNum;
    }


    // Multiple-field Comparable with primitive fields
//    public int compareTo(PhoneNumber pn) {
//        int result = Short.compare(areaCode, pn.areaCode);
//        if (result == 0) {
//            result = Short.compare(prefix, pn.prefix);
//            if (result == 0)
//                result = Short.compare(lineNum, pn.lineNum);
//        }
//        return result;
//    }

    /*
        The Comparator class has a full complement of construction methods. There
        are analogues to comparingInt and thenComparingInt for the primitive types
        long and double. The int versions can also be used for narrower integral types,
        such as short, as in our PhoneNumber example. The double versions can also be
        used for float. This provides coverage of all of Java’s numerical primitive types.
     */
    private static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparingInt(pn -> pn.prefix)
                    .thenComparingInt(pn -> pn.lineNum);

    public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }

    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d",areaCode, prefix, lineNum);
    }

    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber((short)100,(short)199,(short)100);
        PhoneNumber p2 = new PhoneNumber((short)100,(short)50,(short)300);
        PhoneNumber p3 = new PhoneNumber((short)34,(short)199,(short)100);
        PhoneNumber p4 = new PhoneNumber((short)300,(short)199,(short)100);
        PhoneNumber p5 = new PhoneNumber((short)300,(short)199,(short)68);

        PhoneNumber[] numbers = new PhoneNumber[]{p1,p2,p3,p4,p5};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
