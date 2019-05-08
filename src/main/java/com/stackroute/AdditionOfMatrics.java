package com.stackroute;
import java.util.Scanner;

public class AdditionOfMatrics {
    public static void main(String args[]) {
        int rows, cols, sumOfrows, sumcols;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        rows = in.nextInt();
        cols= in.nextInt();

        int first[][] = new int[rows][cols];
        int second[][] = new int[rows][cols];
        int sum[][] = new int[rows][cols];

        System.out.println("Enter the elements of first matrix");

        for (sumOfrows= 0; sumOfrows < rows; sumOfrows++)
            for (sumcols = 0; sumcols< cols; sumcols++)
                first[sumOfrows][sumcols] = in.nextInt();

        System.out.println("Enter the elements of second matrix");

        for (sumOfrows= 0; sumOfrows< rows; sumOfrows++)
            for (sumcols = 0; sumcols< cols; sumcols++)
                second[sumOfrows][sumcols] = in.nextInt();

        for (sumOfrows= 0; sumOfrows < rows; sumOfrows++)
            for (sumcols = 0; sumcols < cols; sumcols++)
                sum[sumOfrows][sumcols] = first[sumOfrows][sumcols] + second[sumOfrows][sumcols];  //replace '+' with '-' to subtract matrices

        System.out.println("Sum of the matrices:");

        for (sumOfrows = 0; sumOfrows < rows; sumOfrows++) {
            for (sumcols= 0; sumcols < cols; sumcols++)
                System.out.print(sum[sumOfrows][sumcols] + "\t");

            System.out.println();
        }
    }
}




