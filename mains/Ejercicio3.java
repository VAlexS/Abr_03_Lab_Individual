package mains;

import clases.videos.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        Video video1 = new Movie("Señor dame paciencia", 3, 4.5);

        System.out.println("Video 1");
        System.out.println(video1.getInfo());

        System.out.println("_____________________");

        Video video2 = new TvSeries("La que se avecina", 1, 194);

        System.out.println("Video 2");
        System.out.println(video2.getInfo());

    }
}
