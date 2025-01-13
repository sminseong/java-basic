package jungol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.printf("Number? ");
        int a = sc.nextInt();
        //int b = sc.nextInt();
        //int c = sc.nextInt();
        switch (a) {
            case 1,3,5,7,8,10,12:
                System.out.printf("31");
                break;
            case 4,6,9,11:
                System.out.printf("30");
                break;
            default:
                System.out.printf("28");
                break;
        }
    }
}
