package WT_LAB.Lab11;

public class q3 {

    public static void main(String[] args) {
        int[] arr = null;

        try {
            arr = new int[-3]; // NegativeArraySizeException
            arr[3] = 10; // ArrayIndexOutOfBoundsException
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}