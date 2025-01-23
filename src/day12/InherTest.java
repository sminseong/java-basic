package day12;

import java.util.Scanner;

class Calculation {
    void addition(int a, int b) {
        System.out.printf("두 수의 덧셈 : %d%n", a+b);
    }
    void subtraction(int a, int b) {
        System.out.printf("두 수의 뺄셈 : %d%n", a-b);
    }
}
class Inheritance01 extends Calculation {
    void multiplication(int a, int b) {
        System.out.printf("두 수의 곱셈 : %d%n", a*b);
    }
}

public class InherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inheritance01 obj = new Inheritance01();

        System.out.println("두 수 입력");
        int a = sc.nextInt();
        int b = sc.nextInt();

        obj.addition(a, b);
        obj.subtraction(a, b);
        obj.multiplication(a, b);
    }
}
