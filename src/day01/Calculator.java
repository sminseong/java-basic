package day01;

import java.util.Scanner;

public class Calculator {
    //1 + 1 = ?
    public static void main(String[] args) {
        //1. 데이터 자유 입력
        Scanner in = new Scanner(System.in);
        System.out.println("first number input: ");
            int a = in.nextInt();
        System.out.println("second number input: ");
            int b = in.nextInt();
            int sum = 0;

        //2. 데이터 처리        //3. 데이터 결과 저장
            for (int i=a; i<=b; i++) {
                System.out.println("i= " + i);
                if (i % 2 == 1) {
                    sum += i;
                }
            }
        //4. 결과 출력
        System.out.println("1 - 100까지 더한값: " + sum);
    }
}