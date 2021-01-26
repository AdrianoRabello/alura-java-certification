package com.alura.java.certification.operators;

/**
 * @autor Adriano Rabello 25/01/2021  9:41 AM
 */
public class MathimaricOperators {

    public static void main(String[] args) {

        int a = 15, b = 20, c = 30;
        //int y,x;

        /** a variable recive result of sum b  + c and + 1. First variable recive cakcuke result */
        a = (b = c) + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("------------ calculating --------------------------");

        int i1 = 3 / 2;

        System.out.println(i1);

        double i3 = 3 / 2.0;
        System.out.println(i3);

        /** dovosion by 0. No compile */
        //System.out.println(3 / 0);
        System.out.println(3 / 0.0);
        System.out.println(3.0 / 0);
        System.out.println(-3.0 / 0);

        System.out.println("--------------------");
        int $$ = 5;
        int __ = $$++;/** in this case __ recive value 5 but $$ increments 1 after this opration */


        System.out.println($$);
        if (__ < ++$$ || __-- > $$) /** in this case +$$ will increase one berave compare with __ . $$ value is 7 cuz inside if increse it */
            System.out.print("A");

        System.out.print($$);
        System.out.print(__);


        System.out.println(" --------------------- ");

        char j = 65;
        char c2 = 68 - 65;
        System.out.println(j + c2);


    }
}
