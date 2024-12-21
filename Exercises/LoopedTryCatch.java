package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopedTryCatch {
    public static void main(String[] args) {

        boolean done = false;

        while (!done) {
            try {
                Scanner userInput = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int number = userInput.nextInt();
                userInput.close();

                if (number < 1) {
                    System.out.println("A number should be greater than 0");
                } else {
                    for (int i = 1; i <= number; i++) {
                        for (int j = 1; j <= number; j++) {
                            if (j == number) {
                                System.out.print(j);
                            } else {
                                System.out.print(j + ", ");
                            }
                        }
                        System.out.println();
                    }
                    done = true;
                }

            } catch (InputMismatchException exception) {
                System.out.println("Proszę podać liczbę całkowitą");
            }
        }


    }
}
