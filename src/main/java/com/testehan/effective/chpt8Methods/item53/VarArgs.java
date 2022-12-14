package com.testehan.effective.chpt8Methods.item53;

public class VarArgs {

    // Simple use of varargs
    static int sum(int... args) {
        int sum = 0;
        for (int arg : args)
            sum += arg;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4));
    }
}
