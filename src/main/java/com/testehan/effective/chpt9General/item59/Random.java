package com.testehan.effective.chpt9General.item59;

import java.util.concurrent.ThreadLocalRandom;

public class Random {

    public static void main(String[] args) {

        // use this class intead of the old Random
        System.out.println(ThreadLocalRandom.current().nextInt());
    }
}
