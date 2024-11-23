package Exercises;//Zadanie 1. Napisać program służący do konwersji wartości
//temperatury podanej w stopniach Celsjusza na stopnie w skali
//Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        final double MULTIPLIER = 1.8;
        final double OFFSET = 32;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
        double celsius = scanner.nextDouble();
        scanner.close();

        double fahrenheit = (celsius * MULTIPLIER) + OFFSET;

        System.out.println(celsius + " stopni Celsjusza to " + fahrenheit + " stopni Fahrenheita.");
    }
}
