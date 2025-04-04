package mains;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ejercicio1 {

    public static double redondeoMasCercano(BigDecimal bigDecimal){
        return bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double redondeoCambioSigno(BigDecimal bigDecimal){

        return bigDecimal.negate().setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Introduzca un numero decimal con 4 cifras decimales (ej. 4,2545): ");
        double decimal = scanner.nextDouble();

        //scanner.nextLine(); //limpio el buffee para meter más decimales

        BigDecimal num1 = new BigDecimal(decimal);

        System.out.println("El numero más cercano de "+decimal+" es "+redondeoMasCercano(num1));

        System.out.print("Introduzca otro numero decimal con 4 cifras decimales (ej: 1,2345): ");
        decimal = scanner.nextDouble();


        BigDecimal num2 = new BigDecimal(decimal);

        System.out.println("El numero más cercano de "+decimal+" con el cambio de signo es "+redondeoCambioSigno(num2));

        System.out.print("Introduzca otro numero decimal con 2 cifras decimales y negativo (ej: -45,67): ");
        decimal = scanner.nextDouble();

        BigDecimal num3 = new BigDecimal(decimal);

        System.out.println("El numero más cercano de "+decimal+" con el cambio de signo es "+redondeoCambioSigno(num3));




    }
}
