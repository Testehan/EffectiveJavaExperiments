package com.testehan.effective.chpt2CreateAndDestroyObjects.item1;

public class MyServiceFactory {

    public static MyService newInstance(){
        try {
            return (MyService)Class.forName(System.getProperty("MyServiceImplementation")).newInstance();
        } catch (Throwable e) {
            return null;
        }
    }
}
