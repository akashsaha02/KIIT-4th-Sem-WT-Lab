// i) Append one string with another string
// ii) Replace one part of the string with another string
// iii) Modify the string by replacing one character with another
// iv) Insert one string into another string

package WT_LAB.Lab13;

import java.util.*;

public class q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first String :");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        String str1 = s1 + s2;
        System.out.println("Append one string with another: " + str1);

        String str2 = str1.replace("ak", "BB");
        System.out.println("Replace one part of the string with another: " + str2);

        String str3 = str2.replace('a', 'W');
        System.out.println("Modify the string by replacing one character with another: " + str3);

        String str4 = str3.substring(0, 4) + s1 + str3.substring(4,6);
        System.out.println("Insert one string into another: " + str4);
    }
}
