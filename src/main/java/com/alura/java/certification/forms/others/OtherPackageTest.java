package com.alura.java.certification.forms.others;

import com.alura.java.certification.forms.Form;

/**
 * @author Adriano Rabello
 * @created 27 / 01 / 2021 - 07:27
 */
public class OtherPackageTest {

    public static void main(String[] args){

        Form f = new Form();

        /** i can access cuz it's public atribute */
        f.side = 5.5;

        /** i can't access cuz it's protected. i can't even see this atribute from this package. If i was in same package or to extends Form class i can access  */
        //f.name;
        f.getArea();
    }
}
