package Exercises;//Zadanie 2. Wczytać od użytkownika 3 liczby całkowite i wypisać na
//ekran największą oraz najmniejszą z nich.

public class Ex2 {
    public static void main(String[] args) {

        int a = Utils.inputIntStatic("Podaj pierwszą liczbę: ");
        int b = Utils.inputIntStatic("Podaj drugą liczbę: ");
        int c = Utils.inputIntStatic("Podaj trzecią liczbę: ");

        int max;
        int min;

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

        System.out.println("Największa liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);

    }
}
