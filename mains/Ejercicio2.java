package mains;

import clases.coches.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        Coche coche1 = new Sedan("0799 KNG", "Toyota", "Auris", 50000);

        System.out.println("Coche 1");
        System.out.println(coche1.getInfo());

        System.out.println("_____________");

        Coche coche2 = new Truck("3232 FHG", "Man", "TGS", 60000,3.132);

        System.out.println("Coche 2");
        System.out.println(coche2.getInfo());

        System.out.println("____________________");

        Coche coche3 = new UtilityVehicle("4523 MFG", "Iveco", "Dayly", 45000, true);

        System.out.println("Coche 3");
        System.out.println(coche3.getInfo());

        System.out.println("____________________");

        Coche coche4 = new UtilityVehicle("6535 LHF", "Iveco", "Dayly", 30203, false);

        System.out.println("Coche 4");
        System.out.println(coche4.getInfo());




    }
}
