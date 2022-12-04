package com.testehan.effective.chpt4ClassesAndInterfaces.item19;

public class Super {

    // Broken - constructor invokes an overridable method
    public Super() {
        overrideMe();
    }
    public void overrideMe() {
    }
}
