package jungol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int [4][4];

        for (int i=0; i<arr.length-1; i++) {
            int sum = 0;
            System.out.printf("%d번째 학생의 점수 ", i);
            for (int j=0; j<arr[i].length-1; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            arr[i][4] = sum;
            System.out.println();
        }
//        for (int i=0; i<arr.length-1; i++) {
//            int sum = 0;
//            for (int j=0; j<arr.length-1; j++) {
//                sum += arr[i][j];
//            }
//            arr[i][4] = sum;
//        }
        System.out.println("     국어 영어 수학 총점");
        for
    }
}
