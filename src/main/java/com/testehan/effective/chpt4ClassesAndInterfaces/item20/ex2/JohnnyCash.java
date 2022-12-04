package com.testehan.effective.chpt4ClassesAndInterfaces.item20.ex2;

/*
        The beauty of skeletal implementation classes is that they provide all of the
        implementation assistance of abstract classes without imposing the severe constraints that abstract classes impose
        when they serve as type definitions. For most implementors of an interface with a skeletal implementation class,
        extending this class is the obvious choice, but it is strictly optional. If a class cannot be made to
        extend the skeletal implementation, the class can always implement the interface
        directly. The class still benefits from any default methods present on the interface
        itself. Furthermore, the skeletal implementation can still aid the implementor’s
        task. The class implementing the interface can forward invocations of interface
        methods to a contained instance of a private inner class that extends the skeletal
        implementation. This technique, known as simulated multiple inheritance, is
        closely related to the wrapper class idiom discussed in Item 18. It provides many
        of the benefits of multiple inheritance, while avoiding the pitfalls.
*/
public class JohnnyCash implements Singer{

    private CountrySinger countrySinger;

    public JohnnyCash(){
        countrySinger = new InnerCountrySinger();
    }


    @Override
    public void sing() {
        System.out.println("Johnny Cash unique singing voice");
    }

    @Override
    public void dance() {
        countrySinger.dance();
    }

    @Override
    public void compose() {
        System.out.println("Johnny Cash unique composing techniques");
    }

    private class InnerCountrySinger extends CountrySinger{

        @Override
        public void sing() {

        }

        @Override
        public void compose() {

        }
    }
}
