package WT_LAB.Lab12;

import java.util.*;

public class q2 {

    private int x;

    public void processInput() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        x = scanner.nextInt();

        if (x < 0) {
            throw new NegativeNumberException("Negative number exception!");
        } else {
            System.out.println("Double value of the number is: " + (x * 2));
        }

        scanner.close();
    }

    public class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        q2 processInput = new q2();

        try {
            processInput.processInput();
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }

}
