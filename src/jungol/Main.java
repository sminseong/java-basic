package jungol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int sum_odd = 0;

        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i%1==1) {   //덜함
                sum += arr[i];
            } else {
                sum_odd += arr[i];
            }
        }
        System.out.printf("sum : %d%navg : %.1f", sum, (double)sum_odd/arr.length);
    }
}
