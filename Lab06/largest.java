import java.util.Scanner;

class largest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a > b) {
            if (a > c)
                System.out.println("the largest number is " + a);
            else
                System.out.println("the largest number is " + c);

        } else {
            if (b > c)
                System.out.println("the largest number is " + b);
            else
                System.out.println("the largest number is " + c);

        }
    }
}