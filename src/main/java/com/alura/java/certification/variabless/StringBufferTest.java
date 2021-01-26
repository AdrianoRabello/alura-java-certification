package com.alura.java.certification.variabless;

/**
 * @autor Adriano Rabello 24/01/2021  12:45 PM
 */
public class StringBufferTest {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Adriano Rodrigues Rabello");


        System.out.println(sb1);

        /** delete method start ins 0 position and no remove the caractere in the final */
        System.out.println(sb1.delete(8, sb1.length()));

        System.out.println(sb1.insert(7, "esta estudando para carabama"));

        System.out.println(sb1.append("caracaticaticatica"));
    }
}
