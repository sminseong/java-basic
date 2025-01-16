package practice;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        int phone = sc.nextInt();

        while(true) {
            System.out.println(
                    "**************************************************\n" +
                    "          Welcome to Shopping Mall\n" +
                    "          Welcome to Book Market!\n" +
                    "**************************************************\n" +
                    "1. 고객 정보 확인하기      4. 바구니에 항목 추가하기\n" +
                    "2. 장바구니 상품 목록 보기  5. 장바구니의 항목 수량 줄이기\n" +
                    "3. 장바구니 비우기         6. 장바구니의 항목 삭제하기\n" +
                    "7. 영수증 표시하기         8. 종료\n" +
                    "**************************************************");
            System.out.printf("메뉴 번호를 선택해 주세요 ");
            int menu = sc.nextInt();
            if (menu == 8) { break; }
            System.out.printf("현재 고객 정보 : %n이름 %s  연락처 %d%n", name, phone);
        }
    }
}
