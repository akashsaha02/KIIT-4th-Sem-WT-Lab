import java.util.*;
public class mattrixAdd {

    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter row and column number for square matrix: ");
        int n= scan.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];
        System.out.println("Enter elements for 1st matrix: ");
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter elements for 2st matrix: ");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=scan.nextInt();
            }
        }
        System.out.println("The addition of 1st and 2nd matrix is: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
