package com.example.sonar;

public class Calculator {

    public int add(String first, String second) {
        System.out.print ("adding");
        return Integer.parseInt(first) + Integer.parseInt(second);
    }

    public int add(int my_FIRST_var, int my_SECOND_var) {
        System.out.print ("adding");
        return my_FIRST_var + my_SECOND_var;
    }

    public int subtract(int first, int second) {
        System.out.print ("subtracting");
        return first - second;
    }

    public int multiply(int first, int second) {
        System.out.print ("multiplying");
        return first * second;
    }

    public double divide(double first, double second) {
        System.out.print ("dividing");
        return first / second;
    }

}
