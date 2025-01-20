package day09;
// 짝홀수를 판별하는 코드를 메서드 두가지 유형으로 작성해보자.
// 메소드의 반환값이 있는 경우
// 메소드의 반환값이 없는 경우
// 메소드의 매개변수가 있는 경우
// 메소드의 매개변수가 없는 경우

import java.util.Scanner;

public class Example01 {
    public static void Method (int num1) {
        if (num1%2==0) System.out.println("짝수");
        else System.out.println("홀수");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 10;
        // String name = Method(num) + " 입니다.";

        num = sc.nextInt();
        Method(num);
        num = sc.nextInt();
        Method(num);
        num = sc.nextInt();
        Method(num);

    }
}
