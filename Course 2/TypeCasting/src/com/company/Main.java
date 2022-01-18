package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("example for implicit Casting");
        char a = 'A';
        System.out.println("Value of a is " + a);

        int b = a;                              // implicit conversion
        System.out.println("Value of b is " + b);
        float c = a;
        System.out.println("Value of c is " + c);
        long d = a;
        System.out.println("Value of d is " + d);
        double e = a;
        System.out.println("Value of e is " + e);

        System.out.println("\n");

        System.out.println("Examples of explicit Casting");

        double x = 12.5;
        int y = (int)x; // explicit conversion

        System.out.println("Value of x is " + x);
        System.out.println("Value of y is " + y);
    }
}
