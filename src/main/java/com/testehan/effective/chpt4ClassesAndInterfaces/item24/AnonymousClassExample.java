package com.testehan.effective.chpt4ClassesAndInterfaces.item24;

public class AnonymousClassExample {
    public static void main(String[] args) {
        Greet greet = new Greet() {
            @Override
            public void sayHello() {
                System.out.println("Hi in english");
            }
        };
        greet.sayHello();

        GreetAbstract greetAbstract = new GreetAbstract("I am an anonymous class") {
            @Override
            public void sayWhatYouWant() {
                System.out.println("Things to say : " + thingsToSay);
            }
        };

        greetAbstract.sayWhatYouWant();
    }
}
