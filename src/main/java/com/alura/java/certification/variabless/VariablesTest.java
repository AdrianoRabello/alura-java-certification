package com.alura.java.certification.variabless;

/**
 * @autor Adriano Rabello 24/01/2021  8:52 AM
 */

class Motor{

}

class MyObject{
    int valor;

    void c( int valor){
        this.valor = valor;
    }
}

class Carro{

    int ano; /** for default this is initielized witj 0*/
    char primeiraLetra; /** for default this is initialized with empty. Char is numeric and alweys > 0*/
    boolean usado; /** for default this is iniializaed witj false */
    Motor motor; /** for default this is initialized withj null */
    String marca; /** for default this is initialized with empty*/
}

public class VariablesTest {


    public static void main(String[] args) {

        Carro carro = new Carro();
        System.out.println(carro.ano);
        System.out.println(carro.primeiraLetra);
        System.out.println(carro.motor);
        System.out.println(carro.marca);

        /** *  todo test with primitive values */
        /** declaring array. Every one inside aray contains value 0 for default */
        int[] values = new int[10];


        int a = 10;

        /** is this case a has value 10. B isn't have a reference, just have value reference*/
        int b = a ;

        /** this no increments b variable */
        a++;

        System.out.println(a);
        System.out.println(b);


        /** todo test with objec references */

        System.out.println("----------------- object references --------------------------");

        MyObject object1 = new MyObject();

        object1.valor = 10;

        MyObject object2 = object1;

        System.out.println(object1.valor);
        System.out.println(object2.valor);

        /** Tho object 2 refences the same object1 space. If i change objt 1, i also change object2 */

        object1.valor = 15;

        System.out.println(object1.valor);
        System.out.println(object2.valor);

        System.out.println("--------------------   ----------------------");

        MyObject obj = new MyObject();
        obj.valor = 10;
        System.out.println(obj.valor);
        obj.c(30);
        System.out.println(obj.valor);

    }
}
