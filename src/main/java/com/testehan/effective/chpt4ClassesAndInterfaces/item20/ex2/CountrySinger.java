package com.testehan.effective.chpt4ClassesAndInterfaces.item20.ex2;

public abstract class CountrySinger implements Singer{

    @Override
    public void dance() {
        System.out.println("Dancing in country style");
    }
}
