package com.alura.java.certification.methods;

/**
 * @autor Adriano Rabello 26/01/2021  7:22 PM
 * todo if i change only acces modificator i ll recive a error.
 * todo overload methods can has or not diferent return and diferent vidibility. but it can't has the same type and quantity of parameter.
 *
 *
 */


public class Overload {

    /**
     * to overload a methos is necesary to change number of parameters or type of parameter. change the return is not overload
     * if i try to change just the return i ll recive an error.
     */
    public void method1() {

        System.out.println("without parameter");
    }


    /**
     * this is overload.
     */
    public void method1(int x) {

        System.out.println("with parameter");
    }


    /**
     * if i change the order is overload.
     */
    public void method1(int x, String string) {

        System.out.println("with parameter int and string");
    }


    public void method1(String string, int x) {

        System.out.println("with parameter String int");
    }

    /** no compile cuz contains two parameter with the same name */
//    static void noCompile(int c , int c){
//
//    }


}


class MainClass {

    public static void main(String[] args) {

        Overload overload = new Overload();

        overload.method1(); // method
        overload.method1(10); // overload

    }
}
