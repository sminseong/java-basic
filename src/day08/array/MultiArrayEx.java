package day08.array;

public class MultiArrayEx {
    public static void main(String[] args) {
        int[][] scores = {{80, 90, 96}, {76, 88}};
        // 배열의 길이 1차원 배열의 길이(반의 수)
        System.out.println(scores.length + "scores[0]" + "scores[1]");
        System.out.println(scores[0][0]);
        //scores[1] 88출력
        System.out.println(scores[1][1]);

        for (int ban=0; ban<scores.length; ban++) {
            for (int student=0; student<scores[ban].length; student++) {
                System.out.println(scores[ban][student]);
            }
        }
        //for-each 문을 이용하여 2반의 학생들의 점수 합산하고 평균을 구하여 출력하세요 (평균은 소수점 첫째자리까지)
        int sum = 0;

        for (int[] i : scores) {
            for (int j : i) {
                sum += j;
            }
        }
        System.out.printf("총합 : %d%n평균 : %.1f", sum, (double)sum/5);

    }
}
