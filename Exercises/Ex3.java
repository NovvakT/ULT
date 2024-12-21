package Exercises;//Zadanie 5. W sklepie ze sprzętem AGD oferowana jest sprzedaż
//ratalna. Napisz program umożliwiający wyliczenie wysokości
//miesięcznej raty za zakupiony sprzęt. Danymi wejściowymi dla
//programu są:
//        • cena towaru (od 100 zł do 10 tyś. zł), • liczba rat (od 6 do 48).
//Kredyt jest oprocentowany w zależności od liczby rat:
//        • od 6–12 wynosi 2.5% , • od 13–24 wynosi 5%, • od 25–48 wynosi 10%.
//Obliczona miesięczna rata powinna zawierać również odsetki.
//Program powinien sprawdzać, czy podane dane mieszczą się w
//określonych powyżej zakresach, a w przypadku błędu pytać prosić
//użytkownika ponownie o podanie danych.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Rate calculator");

        double price = inputDouble("Enter price: ");
        int rate = Utils.inputIntStatic("Enter rate's number: ");

        printSeparator();

        if (isParameterInvalid(price, rate)) {
            showError();
        } else {
            calculateAndShowResult(price, rate);
        }
    }

    private static boolean isParameterInvalid(double price, int rate) {
        return price < 100 || price > 10_000 || rate < 6 || rate > 48;
    }

    private static void calculateAndShowResult(double price, int rate) {
        double interest = price * getMultiplier(rate);
        double total = price + interest;
        double rateValue = total / rate;

        System.out.println("Intrests: " + interest + "zł");
        System.out.println("Total price: " + total + "zł");
        System.out.println("Rate's value: " + rateValue + "zł");
    }

    private static double getMultiplier(int rate) {
        if (rate <= 12) {
            return 0.025;
        } else if (rate <= 24) {
            return 0.05;
        } else {
            return 0.1;
        }
    }

    private static void printSeparator() {
        System.out.println("-----------------------");
    }

    private static void showError() {
        System.out.println("Wrong input!!!");
        System.out.println("Price should be between 100zł and 10 000zł");
        System.out.println("Rates sholud be between 6 and 48");
    }

    static double inputDouble(String message) {
        try {
            System.out.print(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
            return inputDouble(message);
        }
    }
}
