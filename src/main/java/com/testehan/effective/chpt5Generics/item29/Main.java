package com.testehan.effective.chpt5Generics.item29;

public class Main {

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        for (String arg : args)
            stack.push(arg);
        while (!stack.isEmpty())
            System.out.println(stack.pop().toUpperCase());
    }
}
