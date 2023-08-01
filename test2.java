package WT_LAB;

import java.util.Scanner;

class VacationDetails {
    private String name;
    private String aadhaar;
    private int age;
    private String contactNo;
    public VacationDetails(String name, String aadhaar, int age, String contactNo) throws NotEligibleException {
        if (age < 45) {
            throw new NotEligibleException("NotEligibleException Occured. Age must be at least 45 years.");
        }
        this.name = name;
        this.aadhaar = aadhaar;
        this.age = age;
        this.contactNo = contactNo;
    }

    public String getName() {
        return name;
    }

    public String getAadhaar() {
        return aadhaar;
    }

    public int getAge() {
        return age;
    }

    public String getContactNo() {
        return contactNo;
    }
}

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Aadhaar Number: ");
        String aadhaar = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Contact Number: ");
        String contactNo = scanner.next();

        try {
            VacationDetails v1 = new VacationDetails(name, aadhaar, age, contactNo);
            System.out.println("Person Details: ");
            System.out.println("Name: " + v1.getName());
            System.out.println("Aadhaar Number: " + v1.getAadhaar());
            System.out.println("Age: " + v1.getAge());
            System.out.println("Contact Number: " + v1.getContactNo());

        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}

class NotEligibleException extends Exception {
    public NotEligibleException(String m) {
        super(m);
    }
}