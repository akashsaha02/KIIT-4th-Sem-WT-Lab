import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = scan.nextInt();
   
        if (marks >= 90)
            System.out.println("O grade");
        else if (marks >= 80)
            System.out.println("E grade");
        else if (marks >= 70)
            System.out.println("A grade");
        else if (marks >= 60)
            System.out.println("B grade");
        else if (marks >= 50)
            System.out.println("C grade");
        else if (marks >= 40)
            System.out.println("F grade");

    }
}
