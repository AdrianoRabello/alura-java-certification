package com.alura.java.certification.comparators;

/**
 * @autor Adriano Rabello 26/01/2021  2:42 PM
 */
public class StringComparator {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String ab = "ab";
        /** when a compara literal with literal java put string at pull and is equals */
        System.out.println(ab == "ab");

        /** when i pass a variable java dosen't put at pull */
        System.out.println(ab == a+"b");


        /** in this case we have two objects created. One String object and Literal object inside String */
        String literal = new String("object");
        System.out.println(literal);

        /** comparing objects */


        Client c1 = new Client("Adriano");
        Client c2 = new Client("Clara");
        Client c3 = new Client("Adriano");


        /** in this case java setting the object in memory. Becouse of this is false. For defatul Object class use == */
        System.out.println(c1 == c3);

        /** in this case is true becourse is comparing nome atribute */
        System.out.println(c1.equals(c3));


        String s1 = "s1";
        String s2 = s1.substring(0, 1) + s1.substring(1,2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(s2);


        System.out.println( s1.substring(0, 1));
        System.out.println(s1.substring(0,2));



    }
}


class Client{

    String nome;

    public Client(String nome){
        this.nome = nome;
    }


    /** this methos to be overrride need to be public, return bolean and recive Object
     * @return*/
    @Override
    public boolean equals(Object o){



        Client other = (Client) o;

        return this.nome.equals(other.nome);

    }
}
