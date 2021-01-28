package com.alura.java.certification.constructors;

/**
 * @autor Adriano Rabello 26/01/2021  7:50 PM
 * for default this class has Defeult constructor without argumetns and from other package can't  be initilized.
 * If class is public, the default constructor is public too.
 */
public class ConstructorsTests {

    String name;
    int nameLength = getNameLength();

    public static void main(String[] args) {

        A a = new A();

    }

    ConstructorsTests() {

    }


    int getNameLength() {
        return name.length();
    }


}


class A {

    /**
     * this is initializes before constructor
     */
    int age = 32;

    public A() {
        System.out.println(age);
    }

    public static void main(String[] args) {

        //ConstructorsTests constructorsTests = new ConstructorsTests(); /** id i try to do this i receive null point exception becouse in atributs has method calling atribute like null*/
    }


}

class X {

    final String n;

    X() {
        x();
        n = "anything";
    }

    void x() {

        System.out.println("inside x method X class");
    }

}

class W extends X {


    void x() {
        System.out.println(n.length());
    }

    public static void main(String[] args) {

        /** B class no no have constructor, beecouse of this call X constructor,
         * X constructor call x method and in W class x method is overload and inside call n.lenght() and it's null */
        new W();
    }
}




class TestConstructor{

    String name;

    TestConstructor(){

        /** i can us anhtoer construct inside constructor. A can pass only static method to fill of paraters ins constructor. Loops in constructor no compile */
        this(getStticName());
    }

    TestConstructor(String name){

        this.name = name;
    }


    static String getStticName(){
        return "my static name";
    }


    public static void main(String[] args) {

        new TestConstructor();

    }


}



