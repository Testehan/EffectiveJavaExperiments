package com.testehan.effective.chpt4ClassesAndInterfaces.item24;

public abstract class GreetAbstract {

    protected String thingsToSay;

    public GreetAbstract(String thingsToSay){
        this.thingsToSay = thingsToSay;
    }

    public abstract void sayWhatYouWant();
}
