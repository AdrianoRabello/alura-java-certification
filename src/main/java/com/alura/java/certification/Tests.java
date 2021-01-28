package com.alura.java.certification;

/**
 * @autor Adriano Rabello 27/01/2021  7:34 PM
 */
public class Tests {
}



class B{
    protected String s = "a";

    protected B(){

    }
    static A B(String s){

        return new A(s);

    }
}


class A extends B{

    A(String s){
        this.s = s;
    }

    public static void main(String[] args){

        A b = A.B("t");
        System.out.println(b.s);
    }
}