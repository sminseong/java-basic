package day09;

public class Example03 {
    static void calculate(int x, double y) {
        //final double pi = 3.14;
        System.out.printf("원의 둘레 구하는 공식: 2 X 반지름 X 원주율%n2 X %d X %.2f = %.2f", x, y, 2*x*y);
    }

    public static void main(String[] args) {
        int x = 10;
        double pi = 3.14;
        calculate(x, pi);
    }
}
