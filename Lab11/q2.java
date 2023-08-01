package WT_LAB.Lab11;

public class q2 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        try {
            // Accessing the 4th element of the array, which does not exist.
            int num = arr[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
            e.printStackTrace();
        }
        
    }
}
