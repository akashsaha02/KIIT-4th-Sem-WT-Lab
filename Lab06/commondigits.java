import java.util.*;

public class commondigits {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int array1[] = new int[100];
        int array2[] = new int[100];

        int temp = num1;
        int j = 0;
        int count1 = 0;
        while (temp != 0) {
            array1[j++] = temp % 10;
            temp = temp / 10;
            count1++;
        }

        temp = num2; 
        j = 0;
        int count2 = 0;
        while (temp != 0) {
            array2[j++] = temp % 10;
            temp = temp / 10;
            count2++;
        }
        for (int i = 0; i < count1; i++) {
            for (int k = 0; k < count2; k++) {
                if (array1[i] == array2[k]) {
                    System.out.println("The common digit is: " + array1[i]);
                }
            }
        }
    }
}
