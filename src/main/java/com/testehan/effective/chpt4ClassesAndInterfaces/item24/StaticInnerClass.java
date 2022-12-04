package com.testehan.effective.chpt4ClassesAndInterfaces.item24;

public class StaticInnerClass {

    private static int x = 1;
    private int y = 10;

    public static class StaticNested {

        private void run() {
            // method implementation
            System.out.println("x = " + x);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.StaticNested staticNested = new StaticInnerClass.StaticNested();
        staticNested.run();
    }
}
