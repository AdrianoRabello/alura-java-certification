package com.alura.java.certification.polimorfism;

/**
 * @author Adriano Rabello
 * @created 28 / 01 / 2021 - 07:07
 */
public class OverwriteTests {


    public static void main(String[] args){

        /** In this case, in compilation time java call superclass mehtod but in execution time it'll verify if Helicptero has the method, if it haves, it ll call
         * method from Helicoptero class */
        Veiculo veiculo = new Helicoptero();

        veiculo.tornOn();
    }

}


class Veiculo{

    public void tornOn(){

        System.out.println("this veiculo in turning on ");
    }
}

class Helicoptero extends Veiculo{

    /** if i have the same arguments number, method name, parameter ordenation i have override method. i cant override final method.
     * The return type can be them os super class or more specific. It's never can be more generic.
     * */
    public void tornOn(){

        System.out.println("torning on Helicoptero ");
    }


    /** if i have param in this method i have overload **/
    public void tornOn(String param){

        System.out.println("torning on Helicoptero with param");
    }

}

class A{

    public void method(){
        System.out.println("a");
    }
}

class B extends A{

    public void method(){
        System.out.println("b");
        super.method();
    }

    public void method2(){

        System.out.println("c");
        method();
        super.method();
    }

    public static void main(String [] args){

        new B().method2();
    }
}