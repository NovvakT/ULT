package App;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Utils {
    static int inputInt(String message) {
        try {
            System.out.print(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano błędną wartość");
            return inputInt(message);
        }
    }

    static String inputString(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static void printBanner(String title) {
        String border = "+" + "-".repeat(title.length() + 2) + "+";

        System.out.println("\n" + border);
        System.out.println("| " + title.toUpperCase() + " |");
        System.out.println(border + "\n");
    }

    static void printTable(List<String> collection, String title) {
        int titleLength = title.length();
        int longestItemLength = collection.stream().mapToInt(String::length).max().orElse(0);
        int columnLength = Math.max(titleLength, longestItemLength);
        String titlePlaceholder = "| Id | %-" + columnLength + "s |%n";
        String itemPlaceholder = "| %-2d | %-" + columnLength + "s |%n";
        String horizontalBorder = "+----+" + "-".repeat(columnLength + 2) + "+";

        System.out.println(horizontalBorder);
        System.out.printf(titlePlaceholder, title);
        System.out.println(horizontalBorder);
        for (int i = 0; i < collection.size(); i++) {
            System.out.printf(itemPlaceholder, i + 1, collection.get(i));
        }
        System.out.println(horizontalBorder);
    }

    static void printSeparator() {
        System.out.println("--------------------------------");
    }

}
