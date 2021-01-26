package com.alura.java.certification.variabless;

import java.io.File;
import java.util.ArrayList;

/**
 * @autor Adriano Rabello 24/01/2021  1:00 PM
 */
public class StringTests {


    public static void main(String[] args) {

        String nome = "adriano";

        /** compare too compare with the first name cames berofe second number, if first number cames after second string it'll return one positive number.
         * If first string start before return negative number
         * */
        System.out.println(nome.compareTo("clara"));

        System.out.println("clara".compareTo("adriano"));


        /** equals compare using case sensitive */
        System.out.println("java".equals("Java"));

        /** cimparing values ignoring case sensitive */
        System.out.println("java".equalsIgnoreCase("Java"));


        /** test with string values */

        System.out.println("---------- ------------------");
        int valor = 10;
        int dividePor = 4;
        double resultado = valor / dividePor;

        System.out.println(valor + dividePor + "");
        System.out.println("" + resultado + valor);

        StringBuilder sb = new StringBuilder("guilherme");

        /** get index where contains the word */
        System.out.println(sb.indexOf("e"));

        /** if the word no wxists return -1 */
        System.out.println(sb.indexOf("w"));

        /** get the first word contains the word and after get the second word  */
        System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
    }
}


class Teste {

    static int id = 1;

    public static void main(String[] args) {
        System.out.println(id);
        id = id + 1;

        System.out.println(id);
    }
}

class D {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();

        for (String arg : args) {
            if (new E().existe(arg))
                lista.add(arg);
        }
    }
}


class E {
    public boolean existe(String nome) {
        File f = new File(nome);
        return f.exists();
    }
}


class Extendendo extends E implements Interface {

}

/** we can't have to public class in the same file */
interface Interface {

}



