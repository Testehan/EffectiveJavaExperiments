package com.testehan.effective.chpt3MethodsCommonToObjects.item13;

import java.util.Arrays;

public class Stack implements Cloneable {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        elements[size++] = e;
    }

    public void add(Object o , int position){
        elements[position] = o;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }

    // Clone method for class with references to mutable state
    @Override
    public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    // To see that clone works, call with several command line arguments
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        Stack copy = stack.clone();
        copy.add("x",1);
        copy.add("y",2);
        System.out.println(stack);
        System.out.println(copy);

    }
}
