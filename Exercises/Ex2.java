package Exercises;//Zadanie 2. Wczytać od użytkownika 3 liczby całkowite i wypisać na
//ekran największą oraz najmniejszą z nich.

public class Ex2 {
    public static void main(String[] args) {

        int a = Utils.inputIntStatic("Enter first number: ");
        int b = Utils.inputIntStatic("Enter second number: ");
        int c = Utils.inputIntStatic("Enter third number: ");

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

        System.out.println("The biggest number is: " + max);
        System.out.println("The smallest number is: " + min);

    }
}
