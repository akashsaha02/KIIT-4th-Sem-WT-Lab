package WT_LAB.Lab12;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        try {
            System.out.println("Division result is : " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("Division not possible. Second number can't be zero");
        } finally {
            System.out.print("Do you want to retry (Yes/No): ");
            String retry = input.next();

            if (retry.equalsIgnoreCase("yes")) {
                main(args);
            } else {
                System.out.println("Exiting from the program");
            }
        }
    }
}