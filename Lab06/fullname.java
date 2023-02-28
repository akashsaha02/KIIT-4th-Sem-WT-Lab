import java.util.Scanner;

public class fullname {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();
        String fullName = lastName + ' ' + firstName;
        System.out.println("Full name: " + fullName);

    }
}
