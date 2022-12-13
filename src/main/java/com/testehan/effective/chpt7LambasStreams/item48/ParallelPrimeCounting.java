package com.testehan.effective.chpt7LambasStreams.item48;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class ParallelPrimeCounting {
    // the number of primes less than or equal to n:
    static long pi(long n) {
        return LongStream.rangeClosed(2, n)
                .parallel()                                     // example of stream processing with parallel that is way faster
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
    }

    public static void main(String[] args) {
        System.out.println(pi(10_000_000));
    }
}
