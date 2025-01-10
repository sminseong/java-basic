package day03;

import java.util.Scanner;

public class Calculator {
    /*public static void main(String[] args) {
        // 요구사항
        // 1. 두 개의 정수와 +, -, *, / 해당 연산자를 입력받아서 연산을 출력한다.
        // 2. "exit" 문자가 입력되기 전까지 사칙연산을 수행하는 루틴을 만든다.

        // 생각하기
        // 1. 사칙연산을 수행하는 메소드를 만든다.
        // 2. 사용자 입력을 위한 입력기능
        // 3. 두 개의 정수 데이터와 사칙연산 구분을 위한 하나의 문자 ("+","-","*","/")
        // 4. 만약에 "+" 가 입력되었다면 덧셈연산을 한다. (덧셈기능 메소드를 호출) - if(operator.equls("+")) {
        //                                                                      add(int num1, int num2)
        //                                                                 }

        calculator();
    }*/
    void adder(int num1, int num2) {
        int result = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, result);
    }
    void minus(int num1, int num2) {
        int result = num1 - num2;
        System.out.printf("%d - %d = %d", num1, num2, result);

    }
    void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.printf("%d * %d = %d", num1, num2, result);

    }
    void div(int num1, int num2) {
        double d_num1 = num1;
        double d_num2 = num2;
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        } else {
            double result = d_num1 / d_num2;
            System.out.printf("%d / %d = %.1f", num1, num2, result);
        }


    }
    void calculator() {
        Scanner sc = new Scanner(System.in);
        String msg = " ";
        do {
            System.out.println("========계산기 프로그램=========");
            System.out.println("숫자, 연산자(+,-,*,/), 숫자 순서대로 입력해 주세요.");
            int num1 = sc.nextInt();
            char operator = sc.next().charAt(0);
            int num2 = sc.nextInt();

            if (operator == '+') {
               adder(num1, num2);
            } else if (operator == '-') {
                minus(num1, num2);
            } else if (operator == '*') {
                multiply(num1, num2);
            } else if (operator == '/') {
               div(num1, num2);
            }

            System.out.printf("%n종료하시려면 \'exit\' 를 입력해주세요.%n");
            msg = sc.next();
        }   while (!msg.equals("exit"));
    }


}
