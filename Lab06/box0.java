import java.util.*;

public class box0
 {
    public static void main(String[] args) {

        box B1 = new box();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the box :");
        B1.l = sc.nextFloat();
        System.out.println("Enter the width of the box :");
        B1.w = sc.nextFloat();
        System.out.println("Enter the height of the box :");
        B1.h = sc.nextFloat();

        B1.volume();
        B1.dimen();

    }
}