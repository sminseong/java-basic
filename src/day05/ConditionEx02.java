package day05;

import java.util.Scanner;

public class ConditionEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 10) {
            System.out.println("숫자 10");
        } else if (num == 20) {
            System.out.println("숫자 20");
        } else {
            System.out.println("숫자가 존재하지 않습니다.");
        }

        System.out.println("학점을 입력해주세요.");
        int grade = sc.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("A학점");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B학점");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("C학점");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("D학점");
        } else {
            System.out.println("E학점");
        }
    }
}
