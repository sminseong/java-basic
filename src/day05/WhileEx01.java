package day05;

import java.util.Scanner;

public class WhileEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (choice == 1) {
            int num;

            System.out.println("숫자 입력하세요.");
            num = sc.nextInt();

            if (num%2==0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
            System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니오 0을 입력하세요.");
            choice = sc. nextInt();
            if (choice == 0) break;
        }
        System.out.println("프로그램 종료");

        int i = 0;
        do {
            System.out.println("Hello World");
            i++;
        } while (i<6);
    }
}
