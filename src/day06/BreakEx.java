package day06;

import java.util.Scanner;

public class BreakEx {
    // 주사위 6개의 면에는 1~6까지의 숫자가 있다. 1~5까지의 숫자가 나오면 계속 주사위를 던지고, 6이 나오면 게임을 종료
    // 플레이를 할 때 주사위의 숫자는 예측할 수 없다.
    // 현재 num = 6이면 종료되는 코드, 사용자가 exit를 입력했을 때 종료되는 코드로 바꿔주세요.
    public static void main(String[] args) {
        System.out.println("==== 주사위게임 ====");
        System.out.println("게임을 종료하려면 \"exit\"를 입력하세요.");

        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = (int) (Math.random() * 6) + 1;
            System.out.println(num);

            System.out.println("게임을 중단하시겠습니까?");
            String msg = sc.nextLine();
            if (msg.equals("exit")) {
                System.out.println("주사위 게임을 종료합니다.");
                break;
            }
        }

        System.out.println("프로그램 종료.");
    }
}
