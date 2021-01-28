package com.alura.java.certification.methods;

/**
 * @autor Adriano Rabello 27/01/2021  8:59 PM
 */
public class Overwrite {
}


class Veiculo{

    public void turnOn(){

        System.out.println("vaiculo is tunron");
    }
}

class Helicoptero extends Veiculo{

    /** here im overwrite method */
    public void turnOn(){

        System.out.println("vaiculo is Helicoptero");
    }

    /** ins this casa i have overload. If change parameter quantity, Type of parameter it's ll be overload not overwrite.
     * visibility can be equals or more in sun class. Exception also need to be more opened in sun calss than super class. We never can have super class with public method
     * and sun class with the same method with private access. Final methos never can be overwrite.
     * Every interface methods are public and abstract
     * todo Methods with exceptions in sun class can be sun of super class method exception. Methods in sun class never can be more generic than super class, it's can be only more specific.
     * */
    public void turnOn(String name){

        System.out.println("vaiculo is Helicoptero");
    }

}

/** I can extends a class and  overwrite meethod like abstract. Who'll extends this class nedd to implement abstract method  */
abstract class VeiculoAbstractHeritage extends Veiculo{

    public abstract void turnOn();
}



class VeiculoTest{

    public static void main(String[] args){

        Veiculo veiculo = new Veiculo();
        veiculo.turnOn();

        Veiculo veiculo1 = new Helicoptero(); /** even i have Veiculo instance, in execution java ll call Helicoptror method if it existis inside of the class. If the methos no exists inside class, java ll call mehtos in super class*/


        veiculo1.turnOn();
    }
}

class Exadroid extends Veiculo{

}


class VeiculoFactory{

    Veiculo build(){

        return new Veiculo();
    }
}

class HexadoridFactory extends VeiculoFactory{

    Veiculo build(){
        return new Veiculo();
    }
}


interface A{
    void x();
}

class B implements A{

    /** even interface no have public in method, all calsses need to @override like public */
    @Override
    public void x() {

    }
}
