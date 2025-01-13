package jungol;

import java.util.Scanner;

public class Main_Ex6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int c = sc.nextInt();

        if (a>b) {
            System.out.printf("%d > %d --- %d%n", a, b, 1);
        } else {
            System.out.printf("%d > %d --- %d%n", a, b, 0);
        }
        if (a<b) {
            System.out.printf("%d < %d --- %d%n", a, b, 1);
        } else {
            System.out.printf("%d < %d --- %d%n", a, b, 0);
        }
        if (a>=b) {
            System.out.printf("%d >= %d --- %d%n", a, b, 1);
        } else {
            System.out.printf("%d >= %d --- %d%n", a, b, 0);
        }
        if (a<=b) {
            System.out.printf("%d <= %d --- %d", a, b, 1);
        } else {
            System.out.printf("%d <= %d --- %d", a, b, 0);
        }
    }
}