package com.alura.java.certification.operators;

/**
 * @autor Adriano Rabello 25/01/2021  8:50 AM
 */
public class LogicOperators {


    public static boolean write(String value){
        System.out.println(value);

        return true;
    }

    public static void main(String[] args) {
        boolean bol;

        /** or operator is with only | */
        bol = 1 == 1 | 1 > 2;
        System.out.println(bol);

         bol = 1 == 1 & 1 > 2 ;
        System.out.println(bol);

        /** is true only if one is true and other is false */
        bol = 1 == 1 ^ 1 > 2 ;
        System.out.println(bol);

        /** **/

        bol = 1 == 1 | write("segundo");


        System.out.println("--------------------- ternary -------------------------------------");

        int[] teste = new int[5];

        teste[0] = 1;
        System.out.println(teste.length);


        String nome = "Adriano";

        System.out.println(nome.length());







    }
}
