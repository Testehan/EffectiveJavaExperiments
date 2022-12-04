package com.testehan.effective.chpt4ClassesAndInterfaces.item24;

public class NonStaticInnerClass {
    private int x = 1;

    public class NonStaticNested {

        private void run() {
            // method implementation
            System.out.println("x = " + x);
        }
    }

    public static void main(String[] args) {
        NonStaticInnerClass nonStatic = new NonStaticInnerClass();
        NonStaticInnerClass.NonStaticNested nonStaticNested = nonStatic.new NonStaticNested();
        nonStaticNested.run();
    }
}
