package com.alura.java.certification.conditionals;

/**
 * @autor Adriano Rabello 26/01/2021  4:03 PM
 */
public class Switch {

    public static void main(String[] args) {

        int opcao = 0;

        final int variable = 3;

        switch (opcao){

            case 0:
            case 1:
                System.out.println("valor 0 or 1 ");
                break;
            case 2 :
                System.out.println("valor 1 ");
                break;
            case variable: /** inside swtich i just can use final variable */
                System.out.println("valor 2");
                break;
            default: /** if no has case for the value  */
                System.out.println("default");
        }




        switch ("guimerme"){
            case "guimerme":
                System.out.println("é");
                break;
        }


        int count = args.length;
        switch(count) {
            case 0 :{ /** we can use { but we need : too. */
                System.out.println("nenhum");
                break;
            } case 1 : {
            } case 2 : {
                System.out.println("ok");
            } default : {
                System.out.println("default");
            }
        }


    }
}
