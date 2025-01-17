package jungol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] score = new int[101];

        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]==0) { break; }
            score[arr[i]-arr[i]%10]++;
        }
        for (int i=score.length-1; i>=0; i--) {
            if (score[i]!=0) {
                System.out.printf("%d : %d person%n", i, score[i]);
            }
        }
    }
}
