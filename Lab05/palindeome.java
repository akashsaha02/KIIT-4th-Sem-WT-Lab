import java.util.Scanner;

public class palindeome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if its a palindromeor not: ");
        int d = scan.nextInt();
        int r, sum = 0, temp;
        temp = d;
        while (d > 0) {
            r = d % 10;
            sum = (sum * 10) + r;
            d /= 10;
        }
        if (temp == sum) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }

    }

}
