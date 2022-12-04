package com.testehan.effective.chpt4ClassesAndInterfaces.item22;

/*
        Incidentally, note the use of the underscore character (_) in the numeric literals. Underscores, which have been
        legal since Java 7, have no effect on the values of numeric literals, but can make them much easier to read if
        used with discretion.
        Consider adding underscores to numeric literals, whether fixed of floating point, if they contain five or more
        consecutive digits.
*/
public class PhysicalConstants {

    private PhysicalConstants() { }  // Prevents instantiation

    // Avogadro's number (1/mol)
    public static final double AVOGADROS_NUMBER = 6.022_140_857e23;

    // Boltzmann constant (J/K)
    public static final double BOLTZMANN_CONST  = 1.380_648_52e-23;

    // Mass of the electron (kg)
    public static final double ELECTRON_MASS    = 9.109_383_56e-31;
}
