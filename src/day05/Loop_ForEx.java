package day05;

public class Loop_ForEx {
    public static void main(String[] args) {
        for (int i=1; i<=2; i++) {
            for (int j=1; j<=2; j++) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }
        for (int dan=2; dan<=9; dan++) {
            System.out.printf("=== %d단 출력 ===%n", dan);
            for (int i=1; i<=9; i++) {
                System.out.printf("%d X %d = %d%n", dan, i, dan*i);
            }
        }
    }
}
