package WT_LAB.Lab09;
import java.util.Scanner;

class Bank {
    double ROI;

    void find_ROI() {
        System.out.println("Rate of Interest: " + ROI + "%");
    }
}

class HDFC extends Bank {
    double annual_profit;

    HDFC(double annual_profit) {
        this.annual_profit = annual_profit;
        ROI = (annual_profit / 1.5) * 100;
    }

    @Override
    void find_ROI() {
        System.out.println("Rate of Interest for HDFC Bank: " + ROI + "%");
    }
}

class ICICI extends Bank {
    double fund_RBI;

    ICICI(double fund_RBI) {
        this.fund_RBI = fund_RBI;
        ROI = (fund_RBI / 1.5) * 100;
    }

    @Override
    void find_ROI() {
        System.out.println("Rate of Interest for ICICI Bank: " + ROI + "%");
    }
}

class TestBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Annual Profit for HDFC Bank: ");
        double annual_profit = sc.nextDouble();
        HDFC hdfc = new HDFC(annual_profit);

        System.out.println("Enter Fund supported by RBI for ICICI Bank: ");
        double fund_RBI = sc.nextDouble();
        ICICI icici = new ICICI(fund_RBI);

        Bank bank1 = new HDFC(annual_profit);
        Bank bank2 = new ICICI(fund_RBI);

        bank1.find_ROI();
        bank2.find_ROI();
    }
}

