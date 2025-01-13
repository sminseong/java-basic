package jungol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.printf("점수를 입력하세요. ");
        int a = sc.nextInt();
        //int b = sc.nextInt();
        //int c = sc.nextInt();

        String str = (a==0)? "zero": (a>0)? "plus": "minus";
        System.out.print(str);

    }
}
