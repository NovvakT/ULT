package Exercises;//Zadanie 6. Napisać program realizujący funkcje prostego kalkulatora,
//pozwalającego na wykonywanie operacji dodawania, odejmowania,
//mnożenia i dzielenia na dwóch liczbach rzeczywistych. Program ma
//identyfikować sytuację wprowadzenia błędnego symbolu działania
//oraz próbę dzielenia przez zero. Zastosować instrukcję switch do
//wykonania odpowiedniego działania w zależności od
//wprowadzonego symbolu operacji. Scenariusz działania programu:
//a) Program wyświetla informację o swoim przeznaczeniu.
//b) Wczytuje pierwszą liczbę.
//c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
//d) Wczytuje drugą liczbę.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Prosty kalkulator");
        System.out.println("-----------------");

        int a = Utils.inputIntStatic("Podaj pierwszą liczbę: ");
        String sign = inputString("Podaj znak operacji (+, -, *, /): ");
        int b = Utils.inputIntStatic("Podaj drugą liczbę: ");

        System.out.println("-----------------");

        switch (sign) {
            case "+":
                System.out.println("a + b = " + (a + b));
                break;
            case "-":
                System.out.println("a - b = " + (a - b));
                break;
            case "*":
                System.out.println("a * b = " + (a * b));
                break;
            case "/":
                if (b==0){
                    System.out.println("W przypadku dzielenia drugą liczbą nie może być zero!");
                } else {
                    System.out.println("a / b = " + (a / b));
                }
                break;
            default:
                System.out.println("Podano błędną operację");
        }

    }

    static String inputString(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
