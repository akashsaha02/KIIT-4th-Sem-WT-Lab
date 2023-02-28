import java.util.*;

public class diagonalSum {
    static public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows and columns for square matrix: ");

        int m = scan.nextInt();

        int b[][] = new int[m][m];

        System.out.println("Enter elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = scan.nextInt();
            }
        }

        int primaryDiagonal = 0, secondaryDiagonal = 0;

        for (int k = 0; k < m; k++) {
            for (int l = 0; l < m; l++) {
                if (k == l)
                    primaryDiagonal += b[k][l];
                if ((k + l) == (m - 1))
                    secondaryDiagonal += b[k][l];
            }
        }
        System.out.println("Sum of Primary Diagonal:" + primaryDiagonal);

        System.out.println("Sum of Secondary Diagonal:" + secondaryDiagonal);

    }
}
