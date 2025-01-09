package day02;

import java.util.Scanner;

public class TotalEx01 {
    //멤버변수
    static Scanner sc = new Scanner(System.in);

    //사칙연산 기능 메서드 fourArithmetic
    static void fourArithmetic() {
        System.out.printf("첫번째 숫자를 입력해 주세요.");
        int a = sc.nextInt();
        System.out.printf("두번째 숫자를 입력해 주세요.");
        int b = sc.nextInt();
        int result = 0;

        result = a + b;
        System.out.printf("a + b = %d%n", result);
        result = a - b;
        System.out.printf("a - b = %d%n", result);
        result = a * b;
        System.out.printf("a * b = %d%n", result);
        result = a / b;
        System.out.printf("a / b = %d%n", result);
    }
    //operator 기능 메서드
    static void operater() {
        System.out.printf("국어 점수를 입력해 주세요.");
        int kor = sc.nextInt();
        System.out.printf("영어 점수를 입력해 주세요.");
        int eng = sc.nextInt();
        int total = kor + eng;
        double average = total / 2.0;

        System.out.printf("총점:%d%n", total);
        System.out.printf("평균:%.1f%n", average); // 소수점 3번째 자리에서 반올림한 결과 출력
    }
    public static void main(String[] args) {
        fourArithmetic();
        operater();
    }
}
