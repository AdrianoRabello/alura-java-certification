package com.alura.java.certification.methods;

/**
 * @autor Adriano Rabello 27/01/2021  3:52 PM
 */
public class Variables {

    public static void main(String[] args){

        System.out.println("------------------------ primitive references ---------------------------");
        int i = 2;

        System.out.println(i);
        test(i);
        System.out.println(i);


        System.out.println("---------------- objects references ---------------------");

        Test test = new Test();
        test.value = 10;

        /** when i pass object in method i pass the reference in memory not value.*/
        test(test);

        System.out.println(test.value);


        test2(test);
        System.out.println(test.value);

    }

    static void test(int i){
        i = 5;
        System.out.println(i);
    }

    static void test(Test obj){

        obj.value = 210;
    }

    /** in this case the method create another object in memory and no change object in argument value. */
    static void test2(Test obj){

        obj = new Test();
        obj.value = 210;
    }
}

class Test{

    int value;
}
