package App;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Utils {

    static Company initData() {
        Person firstPerson = new Person("Jayce", "Heimerdinger");
        Person secondPerson = new Person("Vi", "Vander");
        Person thirdPerson = new Person("Jinx", "Silco");
        Person forthPerson = new Person("Viktor", "Sevika");
        Person fifthPerson = new Person("Milo", "Clogger");

        Employee firstEmployee = new Employee(firstPerson, Department.SALES);
        Employee secondEmployee = new Employee(secondPerson, Department.FINANCE);
        Employee thirdEmployee = new Employee(thirdPerson, Department.ADMINISTRATION);
        Employee forthEmployee = new Employee(forthPerson, Department.FINANCE);
        Employee fifthEmployee = new Employee(fifthPerson, Department.ADMINISTRATION);

        List<Employee> employees = new ArrayList<>();

        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);
        employees.add(forthEmployee);
        employees.add(fifthEmployee);

        Company company = new Company("Med-Pack");
        company.setEmployees(employees);
        return company;
    }

    static int inputInt(String message) {
        try {
            System.out.print(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
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

    static void printTable(List<String> collection) {
        int titleLength = "Available Actions".length();
        int longestItemLength = collection.stream().mapToInt(String::length).max().orElse(0);
        int columnLength = Math.max(titleLength, longestItemLength);
        String titlePlaceholder = "| Id | %-" + columnLength + "s |%n";
        String itemPlaceholder = "| %-2d | %-" + columnLength + "s |%n";
        String horizontalBorder = "+----+" + "-".repeat(columnLength + 2) + "+";

        System.out.println(horizontalBorder);
        System.out.printf(titlePlaceholder, "Available Actions");
        System.out.println(horizontalBorder);
        for (int i = 0; i < collection.size(); i++) {
            System.out.printf(itemPlaceholder, i + 1, collection.get(i));
        }
        System.out.println(horizontalBorder);
    }

    static void printAnswer(String message) {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    static void printSeparator() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
    }
}
