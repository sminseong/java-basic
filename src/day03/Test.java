package day03;

public class Test {
    public static void main(String[] args) {
        String str = "나는 \t 자바 \\J2SE\\를 학습\n 중입니다"; //이스케이프 문자
        System.out.println(str);

        String ex5 = "서식 문자로 출력하는 방법입니다.\n이것은 문자열을 나타냅니다.";
        System.out.println(ex5);

        String ex6 = "수를 출력할 때는 따옴표를 생략합니다.\n123\n6.500000";
        System.out.println(ex6);

        String ex7 = "수식을 출력하면 계산 결과가 출력됩니다.";
        int a = 10;
        int b = 5;
        int result = a + b;
        String birth = "내 생일은 ~~ 입니다.";

        System.out.printf("%s%n%d + %d = %d%n%s%n", ex7, a, b, result, birth);

        // java13 부터 텍스트 블록 문법을 제공함
        String ex8 = """
                 subject score
                ==============
                  korean    90
                 english   100
                computer    80
                김진수 학생의 점수는\
                최우수로 졸업하였습니다.
                """;
        System.out.println(ex8);
    }
}
