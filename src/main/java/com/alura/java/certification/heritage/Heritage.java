package com.alura.java.certification.heritage;

/**
 * @autor Adriano Rabello 27/01/2021  4:38 PM
 */
public class Heritage {
}


class W {

    public static void print(){

        System.out.println("print mehod inside W class " );
    }
}

class Y extends W{


    /** static methos can't call super */
    public static void print(){

    }

}

class Test{

    public static void main(String[] args ){

        new W().print();

        W w = new W();

        /**  can call static method with instance */
        w.print();
    }
}
