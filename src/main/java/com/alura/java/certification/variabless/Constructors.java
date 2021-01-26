package com.alura.java.certification.variabless;

/**
 * @autor Adriano Rabello 24/01/2021  12:29 PM
 */

class Calculator {

    /** recive many int maarameter  or an int array */
    public int sum(int... number) {

        int value = 0;
        for (int x = 0; x < number.length; x++) {

            value += number[x];

        }

        return value;
    }
}

public class Constructors {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("calculator value " + calculator.sum(1,2,3));
    }
}
