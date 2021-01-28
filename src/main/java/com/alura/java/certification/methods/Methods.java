package com.alura.java.certification.methods;

/**
 * @autor Adriano Rabello 26/01/2021  4:31 PM
 */

class Param{

    void test(int x, int y){

        System.out.println(x);
        System.out.println(y);
    }

    /** i cant change x value inside method */
    void finalArg(final int x, int y){

        System.out.println(x);
        System.out.println(y);
    }
}
public class Methods {


    public static void main(String[] args) {

    }

    /** can't be override */
    public final int teste1(){

        return 1;
    }

    /** sub class need to implement*/
    //abstract int ab();

    /** class method */
    public static int sta(){

        return 1;
    }

    /** lock instence */
    public synchronized int sy(){
        return 1;
    }

    public native int na();


    /**mathematic portability */
    public strictfp int str(){

        return 1;
    }

    /** we can thows excetpion int he methods **/




}

class Form{
    private String color = "blue";


    protected void print(){
        System.out.println(color);
    }

    protected int number(String name){

        return 2;
    }

}

class Square extends Form{

    private String color = "red";

    /** if i overload method */
//    protected void print(){
//        System.out.println(color);
//    }


}


class FormTest{

    public static void main(String[] args) {

        /** in this case the refece is to Form. If i overload method it'll call Square method */
        Form form = new Square();

        form.print();

        System.out.println(form.number("teste"));
    }
}


