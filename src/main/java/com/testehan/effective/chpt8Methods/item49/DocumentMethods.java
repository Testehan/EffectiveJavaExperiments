package com.testehan.effective.chpt8Methods.item49;

import java.math.BigInteger;
import java.util.Objects;

/*
    Note that the doc comment does not say “mod throws NullPointerException
    if m is null,” even though the method does exactly that, as a byproduct of invoking
    m.signum(). This exception is documented in the class-level doc comment for the
    enclosing BigInteger class. The class-level comment applies to all parameters in
    all of the class’s public methods. This is a good way to avoid the clutter of
    documenting every NullPointerException on every method individually

*/

public class DocumentMethods {

    /**
     * Returns a BigInteger whose value is (this mod m). This method
     * differs from the remainder method in that it always returns a
     * non-negative BigInteger.
     *
     * @param m the modulus, which must be positive
     * @return this mod m
     * @throws ArithmeticException if m is less than or equal to 0
     */
    public BigInteger mod(BigInteger m) {
        if (m.signum() <= 0)
            throw new ArithmeticException("Modulus <= 0: " + m);
         // Do the computation

        return new BigInteger("30");
    }

    // there’s no reason to perform null checks manually anymore
    public void someOperation(BigInteger big){
        Objects.requireNonNull(big, "big is null. BigInteger instance is expected");
    }

    // For Private helper functions you, as the package author, control the
    // circumstances under which the method is called, so you can and should ensure
    // that only valid parameter values are ever passed in
    private static void sort(long a[], int offset, int length) {
        assert a != null;    // in order to enable the asserts you need to pass the VM -ea option..If not they will not execute.
                            // I've put the -ea option in the runner from intellij UI
                            // https://stackoverflow.com/questions/18168257/where-to-add-compiler-options-like-ea-in-intellij-idea
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;
        // Do the computation
    }


    public static void main(String[] args) {
        long[] array ={10,20,30,40,50,60,71,80,90,91};;
        sort(array,199,29);
    }
}
