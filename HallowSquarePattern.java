package com.codegnan.patternexamples;
import java.util.Scanner;

public class HallowSquarePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // print '*' for first or last row or first/last column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // two spaces for proper alignment
                }
            }
            System.out.println();
        }

	}

}
