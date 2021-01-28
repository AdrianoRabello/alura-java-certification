package com.alura.java.certification.variabless;

/**
 * @autor Adriano Rabello 26/01/2021  5:14 PM
 */

class Motocycle{

    public static int totalMotocicle = 15;


    Motocycle(){

    }

    public static int getTotalMotocicle(){

        return totalMotocicle;
    }


    public static void write(){

        System.out.println("writting");
    }


}

class DoubleMotocicle extends Motocycle{


    /** if i have static mathod in superclass i can't have normal method with the same name in the sun class. */
//    public int getTotalMotocicle(){
//        return 14;
//    }
}

public class StaticTest {

    /** static variables can be lower case */
    static int staticValue = 10;

    /** final variables need to be called uppercase */
    static final int STATIC_FINAL_VALUE = 11;

    public static void main(String[] args) {



        Motocycle motocycle = new Motocycle();

        System.out.println(Motocycle.getTotalMotocicle());

        DoubleMotocicle doubleMotocicle = new DoubleMotocicle();

        System.out.println(doubleMotocicle.getTotalMotocicle());

        new StaticTest().caraca();
        new StaticTest().caraca();

    }


    static void caraca(){

        new B().y();
    }


}

class B {
    void y() {
        this.z();
    }
    static void z() {
        System.out.println("z");
    }
}
class A {
    public static void main(String[] args) {
        new A().x();
    }
    static void x() {
        new B().y();
    }
}

class Y {

    public static void main(String[] args) {


    }

    static void x(){
        new B().y();
    }
}
