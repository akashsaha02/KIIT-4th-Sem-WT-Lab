package WT_LAB;

import java.util.Scanner;

public class Complex {
    double real;
    double imaginary;

    public Complex() {
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void sum(Complex c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    public void swap(Complex c1, Complex c2) {
        double temp_real = c1.real;
        double temp_imaginary = c1.imaginary;
        c1.real = c2.real;
        c1.imaginary = c2.imaginary;
        c2.real = temp_real;
        c2.imaginary = temp_imaginary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st complexx number");

        System.out.println("Enter 1st complexx number real part: ");
        double r1 = sc.nextDouble();
        System.out.println("Enter 1st complexx number imaginary part: ");
        double i1 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);

        System.out.println("Enter 2nd complexx number");

        System.out.println("Enter 2nd complexx number real part: ");
        double r2 = sc.nextDouble();
        System.out.println("Enter 2nd complexx number imaginary part: ");
        double i2 = sc.nextDouble();
        Complex c2 = new Complex(r2, i2);

        System.out.println("Before: ");
        System.out.println("number 1= real part:  " + c1.real + "  imaginary part:  " + c1.imaginary);
        System.out.println("nbmber 2= real part:  " + c2.real + "  imaginary part:  " + c2.imaginary);

        c1.swap(c1, c2);
        System.out.println("After: ");
        System.out.println("number 1= real part:  " + c1.real + "  imaginary part:  " + c1.imaginary);
        System.out.println("nbmber 2= real part:  " + c2.real + "  imaginary part:  " + c2.imaginary);

        c1.sum(c2);
        System.out.println("\n\nSum of two Complex numbers: "+c1.real + "+" + c1.imaginary);
        // System.out.println(c1.real + "+" + c1.imaginary);
    }
}
