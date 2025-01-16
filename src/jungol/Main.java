package jungol;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[][] arr = {{3, 5, 4}, {2, 6, 7}, {8, 10, 1}};

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
