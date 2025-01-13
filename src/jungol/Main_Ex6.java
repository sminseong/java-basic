package jungol;

import java.util.Scanner;

public class Main_Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
        //int result = (a>b)? 1:0;
        //System.out.print(result);
        if (b>=c) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
        if (a<=b) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
        if (b<c) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
    }
}