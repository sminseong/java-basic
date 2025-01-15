package jungol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] month_30 = {4, 6, 9, 11};
        int[] month_31 = {1, 3, 5, 7, 8, 10, 12};

        while (true) {
            System.out.print("YEAR = ");
            int year = sc.nextInt();
            System.out.print("MONTH = ");
            int month = sc.nextInt();

            if (year%400!=0) {
                if (month==2) {
                    System.out.print("입력하신 달의 날 수는 28일입니다.");
                } else {
                    for (int i=0; i<month_30.length; i++) {
                        if(month_30[i]==month) {
                            System.out.print("입력하신 달의 날 수는 30일입니다.");
                        }
                    }
                    for (int i=0; i<month_31.length; i++) {
                        if(month_31[i]==month) {
                            System.out.print("입력하신 달의 날 수는 31일입니다.");
                        }
                    }
                }
            }
        }
    }
}
