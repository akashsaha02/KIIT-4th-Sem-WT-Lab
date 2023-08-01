package WT_LAB.Lab10.Question1;
import java.util.*;
abstract class Student {
    Scanner scan = new Scanner(System.in);

    int roll, regno;

    public abstract void course();
}

class kiitian extends Student {
    String name;

    public void course() {
        System.out.println("Enter your course name");
        name = scan.nextLine();
        System.out.println("Enter your roll no: ");
        roll = scan.nextInt();
        System.out.println("Enter your regestration no: ");
        regno = scan.nextInt();
    }

    void display() {
        System.err.println("\n\nDisplaying information:\n\n");
        System.out.println("Hello! I'm Akash Saha, I am currently studying in KIIT University\nHere are my details:");
        System.out.println("Roll: " + roll);
        System.out.println("Regestration No: " + regno);
        System.out.println("Course: " + name);
    }
}

public class q1 {
    public static void main(String[] args) {
        kiitian k1 = new kiitian();
        k1.course();
        k1.display();
    }
}
