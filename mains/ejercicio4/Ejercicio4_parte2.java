package mains.ejercicio4;

import clases.listas.*;

import java.util.Scanner;

public class Ejercicio4_parte2 {

    public static void main(String[] args) {

        IntList list = new IntVector();

        var scanner = new Scanner(System.in);

        boolean more = true;

        int num;
        char opcion;

        do {
            System.out.print("Introduzca un numero: ");
            num = scanner.nextInt();

            list.add(num);

            scanner.nextLine(); //para limpiar el buffer

            System.out.print("¿Desea introducir más numeros? s -> Sí. n -> No.  ");
            opcion = scanner.nextLine().charAt(0);



            if (opcion == 'n')
                more = false;

        }while (more);


        list.printArray();

    }

}
