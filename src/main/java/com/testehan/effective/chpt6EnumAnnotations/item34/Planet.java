package com.testehan.effective.chpt6EnumAnnotations.item34;

public enum Planet {
    // The numbers in parentheses after each enum constant are parameters that are
    //passed to its constructor. In this case, they are the planet’s mass and radius:
    MERCURY(3.302e+23, 2.439e6),
    VENUS  (4.869e+24, 6.052e6),
    EARTH  (5.975e+24, 6.378e6),
    MARS   (6.419e+23, 3.393e6),
    JUPITER(1.899e+27, 7.149e7),
    SATURN (5.685e+26, 6.027e7),
    URANUS (8.683e+25, 2.556e7),
    NEPTUNE(1.024e+26, 2.477e7);

    private final double mass;           // In kilograms
    private final double radius;         // In meters
    private final double surfaceGravity; // In m / s^2

    // Universal gravitational constant in m^3 / kg s^2
    private static final double G = 6.67300E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass / (radius * radius);
    }

    public double mass()           { return mass; }
    public double radius()         { return radius; }
    public double surfaceGravity() { return surfaceGravity; }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;  // F = ma
    }

    // Note that Planet, like all enums, has a static values method that returns an array
    // of its values in the order they were declared. Note also that the toString method
    // returns the declared name of each enum value, enabling easy printing
    public static void main(String[] args) {
        double earthWeight = 83;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        System.out.println(mass);
        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
    }
}