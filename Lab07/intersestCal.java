import java.util.*;

class savingsAccount {
    Scanner scan = new Scanner(System.in);
    static double interestRate;
    int accountNo;
    String name;
    double balance;

    static void modifyInterest(double a) {
        interestRate = a;
    }

    void calculateInterest() {
        System.out.println("Enter the number of years: ");
        int years = scan.nextInt();
        System.out.println("The ammount is: " + (balance * (1 + (interestRate * years))));
    }

    savingsAccount() {
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter your account no: ");
        accountNo = scan.nextInt();
        System.out.println("Enter your balance: ");
        balance = scan.nextDouble();
    }
}

class interestCal {
    public static void main(String[] args) {
        savingsAccount s1 = new savingsAccount();
        savingsAccount.modifyInterest(0.06);
        s1.calculateInterest();
    }
}