package com.testehan.effective.chpt2CreateAndDestroyObjects.item6;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum());
    }

    private static long sum() {
        Long sum = 0L;  // if this were a Long, then it would take about 8s vs 1s in case of long,
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;   // because each time this sum would be performed, i would need to be autoboxed to a Long
        return sum;
    }
}
