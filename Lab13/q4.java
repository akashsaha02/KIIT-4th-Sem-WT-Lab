// Write a program to swap two string variables without using third variable.

package WT_LAB.Lab13;

import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter string 1: ");
        String s1 = scan.nextLine();

        System.out.println("Enter string 2: ");
        String s2 = scan.nextLine();

        System.out.println("Before Swapping");
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("After Swapping");
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
    }
}
